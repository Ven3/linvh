package cn.ven3.linvh;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

public class LinVHServer {

    public static void main(String[] args) {
        Javalin app = Javalin.create().get("/", new Handler() {
            public void handle(@NotNull Context context) throws Exception {
                context.result("hello");
            }
        }).start(8081);
    }
}
