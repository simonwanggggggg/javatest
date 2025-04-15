package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        GameContext context = GameInitializer.init();  // 初始化地圖與玩家
        GameEngine engine = new GameEngine(context);   // 建立遊戲引擎
        engine.start();                                // 啟動遊戲主迴圈
    }
}
