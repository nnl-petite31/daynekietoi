package DTO;

public class Log {
		private String id;
		private String user;
		private String pass;

		public Log() {
			user = "";
			pass = "";
		}

		public Log(String u, String p) {
			user = u;
			pass = p;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

	}
}
