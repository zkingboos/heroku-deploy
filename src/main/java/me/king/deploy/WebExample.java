package me.king.deploy;

import express.Express;

public final class WebExample {

    public static void main(String[] args) {
        Express app = new Express();

        app.get("/", (req, res) -> {
            res.send("Welcome to index page.");
        });

        String port = System.getenv().getOrDefault("PORT", "80");
        app.listen(Integer.parseInt(port));
    }
}
