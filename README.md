# 田忌撲克

這是一個使用 Java 製作的雙人撲克牌遊戲專案，結合「田忌賽馬」的出牌策略與撲克牌牌型比較。玩家會從 15 張手牌中分配 3 輪出牌，依序比較每一輪牌型大小，最後決定勝負。
![遊戲畫面](HW_00.png "這是遊戲畫面")

## 遊玩影片


https://github.com/user-attachments/assets/1c41ad2a-fa30-4812-bacf-a37bcdb618c2



## 專案特色

- 使用 Java Swing 建立圖形化遊戲介面
- 支援雙人玩家名稱設定
- 自動建立 52 張撲克牌、洗牌與發牌
- 每位玩家取得 15 張手牌
- 玩家可將手牌分配至 3 輪出牌
- 支援 3 張牌與 5 張牌的牌型判斷
- 可依花色、點數、牌型強度進行排序與比較

## 遊戲規則

每位玩家會拿到 15 張牌，並將手牌分成 3 輪：

| 輪次 | 出牌張數 |
| --- | --- |
| 第 1 輪 | 3 張 |
| 第 2 輪 | 5 張 |
| 第 3 輪 | 5 張 |

剩下 2 張牌不使用。雙方完成出牌後，系統會依序比較 3 輪牌型大小。

### 五張牌牌型大小

由大到小：

1. 同花順
2. 鐵支
3. 葫蘆
4. 同花
5. 順子
6. 三條
7. 兩對
8. 一對
9. 高牌

### 三張牌牌型大小

由大到小：

1. 三條
2. 一對
3. 高牌

## 專案結構

```text
Homework01/
├── src/com/
│   ├── Card.java       # 撲克牌資料類別
│   ├── Game.java       # 遊戲流程、洗牌、發牌與規則
│   ├── Game_UI.java    # Java Swing 圖形化介面
│   ├── Main.java       # 測試用主程式
│   ├── Player.java     # 玩家資料與手牌管理
│   ├── Round.java      # 單輪出牌與牌型判斷
│   ├── Sort.java       # 卡牌排序工具
│   └── Final.java      # 保留類別
├── bin/                # 編譯後的 class 檔
└── doc/                # Javadoc 文件
```

## 執行方式

### 使用 Eclipse

1. 開啟 Eclipse。
2. 選擇 `File` > `Import`。
3. 選擇 `Existing Projects into Workspace`。
4. 匯入本專案資料夾。
5. 執行 `src/com/Game_UI.java`。

### 使用指令列

在專案根目錄執行：

```bash
javac -encoding UTF-8 -d bin src/com/*.java
java -cp bin com.Game_UI
```

若只想執行測試用主程式，可執行：

```bash
java -cp bin com.Main
```

## 主要類別說明

| 類別 | 說明 |
| --- | --- |
| `Card` | 儲存單張撲克牌的花色、點數、名稱、位置與比較資料 |
| `Game` | 管理遊戲狀態、規則文字、洗牌、發牌與流程階段 |
| `Game_UI` | 提供 Swing 圖形化操作介面 |
| `Player` | 儲存玩家名稱、手牌與 3 輪出牌 |
| `Round` | 判斷單輪牌型並計算牌型強度 |
| `Sort` | 提供依點數、花色、重複張數等條件排序的方法 |
| `Main` | 用於測試牌堆、發牌、排序與牌型判斷 |

## 開發環境

- Java
- Eclipse
- Java Swing

## 文件

專案內含 `doc/` 資料夾，可直接開啟以下檔案查看 Javadoc：

```text
doc/index.html
```
