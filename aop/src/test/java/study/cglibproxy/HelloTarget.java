package study.cglibproxy;

class HelloTarget {
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayHi(String name) {
        return "Hi " + name;
    }

    public String sayThankYou(String name) {
        return "Thank You " + name;
    }

    public String pingPong(String name) {
        return "Ping Pong " + name;
    }

    public String doSay(String name) {
        return name;
    }

    public String doSayYesOrNo() {
        return "yes";
    }
}
