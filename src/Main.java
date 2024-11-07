public class Main {
    public static void main(String[] args) {
        System.out.println("test1");
        validateData("JHJHg_22", "ttt", "ttt");

        System.out.println("test2");
        validateData("JHJHg_2@", "ttt", "ttt");

        System.out.println("test3");
        validateData("JHJHg_22", "ttt", "tt");

        System.out.println("test4");
        validateData("JHJHg_22", "ttt3+", "ttt3+");
    }

    public static void validateData(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void validateLogin(String login) throws WrongLoginException {
        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Login is null or empty");
        }

        String loginRegex = "^[a-zA-Z0-9_]{1,20}$";

        if (!login.matches(loginRegex)) {
            throw new WrongLoginException("Invalid login");
        }
    }

    public static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || password.isEmpty() || confirmPassword == null || confirmPassword.isEmpty()) {
            throw new WrongPasswordException("Password is null or empty");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }

        String passwordRegex = "^[a-zA-Z0-9_]{1,20}$";

        if (!password.matches(passwordRegex)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}
