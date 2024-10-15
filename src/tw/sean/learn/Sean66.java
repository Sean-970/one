package tw.sean.learn;

import org.mindrot.BCrypt;

public class Sean66 {

	public static void main(String[] args) {
		String passwd = "123456";
		String newpasswd = BCrypt.hashpw(passwd, BCrypt.gensalt());
		System.out.println(newpasswd);
		System.out.println(newpasswd.length());
		if(BCrypt.checkpw("123456", newpasswd)) {
			System.out.println("ok");
		}else {
			System.out.println("xx");
		}

	}

}
