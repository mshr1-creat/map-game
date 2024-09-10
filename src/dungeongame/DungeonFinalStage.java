package dungeongame;

public class DungeonFinalStage {
	public static int Map5(int[][] map5) {
		// **** 主人公の位置を表す変数 **** //
		int myX = 1;	// 横位置			// ← 追加
		int myY = 1;	// 縦位置			// ← 追加
		
		// *** キーボード入力用の変数 *** //
		String key = "";
		
		// *** ループの条件を設定 *** //
		String loop ="continue";
		
		// do while文で"q"が入力されるまで入力を続ける
		do {
			// ***** コマンドの入力処理 *****
			System.out.print("コマンド？(m:マップ) > ");
			key = new java.util.Scanner(System.in).nextLine();	// キーボードの入力を受け付ける
				switch(key) {
					case "m" -> {
						// マップのコピーを作成
	                    int[][] mapDisplay = new int[map5.length][map5[0].length];
	                    for (int i = 0; i < map5.length; i++) {
	                        for (int j = 0; j < map5[i].length; j++) {
	                            mapDisplay[i][j] = map5[i][j];
	                        }
	                    }

	                    // 主人公の位置をコピーしたマップに一時的に設定
	                    mapDisplay[myX][myY] = 3;

	                    // マップの表示処理
	                    for (int i = 0; i < mapDisplay.length; i++) {
	                        for (int j = 0; j < mapDisplay[i].length; j++) {
	                            // 壁などの表示処理
	                            if (mapDisplay[i][j] == 0) {
	                                System.out.print("・");
	                            } else if (mapDisplay[i][j] == 1) {
	                                System.out.print("■");
	                            } else if (mapDisplay[i][j] == 2) {
	                                System.out.print("％");
	                            } else if (mapDisplay[i][j] == 3) {
	                                System.out.print("＠");
	                            } else if (mapDisplay[i][j] == 4) {
	                                System.out.print("★");
	                            }
	                        }
	                        System.out.println("");
	                    }
	                }
					case "q" ->{
						System.out.println("ゲームを終了します");
						loop = "exit";
						
					}
					case "s" ->{
						System.out.println("↓にすすみました");
						if(map5[myX+1][myY]== 0||map5[myX+1][myY]== 2||map5[myX+1][myY]== 4){
							myX++;
							if(map5[myX][myY]==2) {
								System.out.println("おめでとう！ダンジョンをクリアしました！");
							}else if(map5[myX][myY]==4) {
								myX = 1;
								myY = 1;
								System.out.println("ふりだしに戻る");
							}
						}else {
							System.out.println("×そちらは壁でした");
						}
					}
					case "a" ->{
						System.out.println("←左にすすみました");
						if(map5[myX][myY-1]==0||map5[myX][myY-1]==2||map5[myX][myY-1]==4) {
							myY--;
							if(map5[myX][myY]==2) {
								System.out.println("おめでとう！ダンジョンをクリアしました！");
							}else if(map5[myX][myY]==4) {
								myX = 1;
								myY = 1;
								System.out.println("ふりだしに戻る");
							}
						}else {
							System.out.println("×そちらは壁でした");
						}
					}
					case "w" ->{
						System.out.println("↑上に進みました");
						if(map5[myX-1][myY]==0||map5[myX-1][myY]==2||map5[myX-1][myY]==4) {
							myX--;
							if(map5[myX][myY]==2) {
								System.out.println("おめでとう！ダンジョンをクリアしました！");
							}else if(map5[myX][myY]==4) {
								myX = 1;
								myY = 1;
								System.out.println("ふりだしに戻る");
							}
						}else {
							System.out.println("×そちらは壁でした");
						}
					}
					case "d" ->{
						System.out.println("→右にすすみました");
						if(map5[myX][myY+1]==0||map5[myX][myY+1]==2||map5[myX][myY+1]==4) {
							myY++;
							if(map5[myX][myY]==2) {
								System.out.println("おめでとう！ダンジョンをクリアしました！");
							}else if(map5[myX][myY]==4) {
								myX = 1;
								myY = 1;
								System.out.println("ふりだしに戻る");
							}
						}else {
							System.out.println("×そちらは壁でした");
						}
					}
					default ->{
					    System.out.println("コマンドが違います");
					}
				} // Switch文
		}while(loop.equals("continue")); // do While文
		return myX;
	}
}
