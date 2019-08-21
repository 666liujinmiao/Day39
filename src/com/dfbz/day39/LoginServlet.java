package com.dfbz.day39;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//servlet:运行在服务器端的Java小程序
public class LoginServlet extends HttpServlet {
    //servlet生命周期中，其构造方法和init()方法只被调用一次
    public LoginServlet() {
        System.out.println("LoginServlet的构造器");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        String str = config.getInitParameter("server-name");
        System.out.println("init-str:"+str);
    }
    //servlet结束后调用destroy()
    @Override
    public void destroy() {
        System.out.println("LoginServlet的destroy()");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet的doGet");
    }

    /**
     *    
     * doPost 用于接收请求过来的 post 请求的，method="post"  
     * 参数 1：HttpServletRequest 请求对象    
     * 参数 2：HttpServletResponse 响应对象    
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet的doPost");
    }

    //重写了 service()方法，doGet\DoPost 会失效
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("LoginServlet的service");
        /*
        解决乱码：1.通过web.xml的配置中改
                 2.通过Tomcat服务器的server.xml port=8080处改
                 3.通过过滤器filter
                 4.通过doGet/doPost/serve方法中改（本例通过第4种方式）
        * */
        //1.请求参数支持中文编码
        req.setCharacterEncoding("utf-8");
        //2.响应的支持中文编码
        resp.setCharacterEncoding("utf-8");
        String name = req.getParameter("name"); //如果index.jsp中的name值有多个，取第个name值
        String pwd = req.getParameter("password");
        System.out.println("name:" + name + ",password:" + pwd);

        //通过 HttpServletResponse 输出动态页面
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<head>");
        pw.print("<meta charset='UTF-8'>");
        pw.println("<title>登录成功页面</title>");
        pw.println("<body>");

        if ("admin".equals(name) && "123456".equals(pwd)) {
            pw.println("登录成功！");
            pw.print("用户名：" + name + "，密码：" + pwd);
        } else {
            pw.println("登录失败！");
            pw.println("<a href='http://localhost:8080/Day39_war_exploded/'>返回</a>");
        }

        pw.println("</body>");
        pw.println("</head>");
        pw.println("</html>");

    }
}
