package techno.study.ch6;

public class MyException {

    public static void main(String[] args) {
        String url = "illegal url";

        MyException myException = new MyException();
        System.out.println(myException.visit(url));

    }

    public String visit(String url) {
        if (!url.equals("techno.study"))
            throw new NotFoundException("Your url:'" + url + "' is not valid", 404);
        else
            return "Success";
    }

}


class NotFoundException extends RuntimeException {

    public NotFoundException(String message, int code) {
        super(message + "\n BadRequest: " + code);
    }

}
