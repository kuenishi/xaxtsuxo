package fm.garsue.ぁっぉ;

import java.util.Random;

import static spark.Spark.*;

public final class ぁっぉ {
    public static void main(String... args) throws Exception {
        //ぁっぉ ぁっぁっぉ = new ぁっぉ();
        //ぁっぁっぉ.ぉゃっょ();
        Random r = new Random();
        port(8080);
        get("/", (req, res) -> "Hello " + 名前());
        get("/ぁっぉ", (req, res) -> "ぁっぉ〜");
        get("/ぁっぉ〜", (req, res) -> {
            if (r.nextInt(8) == 7) {
                return "ぁっぉぁっぉうるさいぞｗｗｗｗ";
            } else {
                return "ぁっぉ〜";
            }
        });
        staticFileLocation("");
        exception(Exception.class, (e, req, res) ->
        {
            res.status(404);
            res.body("Resource not found");
        });

    }

    public static String 名前() {
        return "ぁっぉ";
    }
/*
    private ぁっぉHTTPサーバー ぁつぁっ = null;
    public ぁっぉ(){
        this.ぁつぁっ = new ぁっぉHTTPサーバー(false, 8080);
    }
    public void ぉゃっょ() throws Exception {
        this.ぁつぁっ.走る();
    }
    */
}
