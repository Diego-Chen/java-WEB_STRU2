/**
 * 
 */
package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAciton extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        String userName=this.getUsername();
        String userPassword=this.getPassword();

        if(userName.equals("admin")&&userPassword.equals("123456")){
            ActionContext.getContext().getSession().put("user", userName); 
            return "success";
        }
        return "failure";
    }
	
}
