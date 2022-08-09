@WebServlet({ "/RegisterServlet", "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private Ctrl ctrl; // 멤버 변수 선언

    public RegisterServlet() {
    	ctrl = new CtrlImpl(); // 사용. 다형성
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		name = new String(name.getBytes("8859_1"), "utf-8");
		System.out.println(name);
		float data1 = Float.parseFloat(request.getParameter("data1"));
		float data2 = Float.parseFloat(request.getParameter("data2"));
		float data3 = Float.parseFloat(request.getParameter("data3"));
		
		Object obj = new VO(num, id, pwd, name, data1, data2, data3);
		
		int flag = ctrl.register(obj);
		if (flag != 0) {
			System.out.println("Success regist");
		} else {
			System.out.println("Fail...Retry");
		}
		
		response.sendRedirect("main.jsp");
		
	}

}