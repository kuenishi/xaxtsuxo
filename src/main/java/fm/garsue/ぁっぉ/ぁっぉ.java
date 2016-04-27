package fm.garsue.ぁっぉ;

public final class ぁっぉ {
    public static void main(String... args) throws Exception {
        ぁっぉ ぁっぁっぉ = new ぁっぉ();
        ぁっぁっぉ.ぉゃっょ();
    }

    public static String getName() {
        return "ぁっぉ";
    }

    private ぁっぉHTTPサーバー ぁつぁっ = null;
    public ぁっぉ(){
        this.ぁつぁっ = new ぁっぉHTTPサーバー(false, 8080);
    }
    public void ぉゃっょ() throws Exception {
        this.ぁつぁっ.run();
    }
}
