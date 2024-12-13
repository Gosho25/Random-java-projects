class SecretMethod {
    public void secret(int x) {
        System.out.println(x + " is the secret!");
    }
}

class Main1 {
    public static void main(String[] args) {
        SecretMethod objX = new SecretMethod();
        objX.secret(2);
    }
}