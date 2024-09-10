
public class DungeonN {
	public static void main(String[] args) {
		// *** マップ用2次元配列の宣言＋作成＋初期化 *** //
				int[][] map =	{{ 1, 1, 1, 1, 1, 1, 1, 1, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 2, 1 },		// ←2に変更
						 		{ 1, 1, 1, 1, 1, 1, 1, 1, 1 }};

				
				// **** 主人公の位置を表す変数 **** //
				int myX = 1;	// 横位置			// ← 追加
				int myY = 1;	// 縦位置			// ← 追加
				
				// *** キーボード入力用の変数 *** //
				String key = "";

				
				// ***** コマンドの入力処理 ***** //
				
				String loop ="continue";
				
				// do while文で"q"が入力されるまで入力を続ける
				do {
					System.out.print("コマンド？(m:マップ) > ");
					key = new java.util.Scanner(System.in).nextLine();	// キーボードの入力を受け付ける
						switch(key) {
							case "m" -> {
								for(int i = 0;i<map.length;i++) {
									for(int j = 0; j<map.length;j++) {
										// ***** 主人公の表示処理 ***** //
				
										// ---- ここから (DungeonD)---- //
										map[myX][myY] = 3;
				
										// ---- ここまで(DungeonD) ---- //
				
				
										// ***** 壁などの表示処理 ***** //
										// ***** マップの表示処理 ***** //
										//  map[][]の値が0…"・" (通路)
										//  map[][]の値が1…"■" (かべ)
										
										if(map[i][j]== 0) {
											System.out.print("・");
										}else if(map[i][j]==1){
											System.out.print("■");
										}else if(map[i][j]==2) {
											System.out.print("％");
										}else if(map[i][j]==3) {
											System.out.print("＠");
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
								if(map[myX+1][myY]== 0||map[myX+1][myY]== 2){
									myX++;
									if(map[myX][myY]==2) {
										System.out.println("おめでとう！ダンジョンをクリアしました！");
									}
								}else {
									System.out.println("×そちらは壁でした");
								}
							}
							case "a" ->{
								System.out.println("←左にすすみました");
								if(map[myX][myY-1]==0||map[myX][myY-1]==2) {
									myY--;
									if(map[myX][myY]==2) {
										System.out.println("おめでとう！ダンジョンをクリアしました！");
									}
								}else {
									System.out.println("×そちらは壁でした");
								}
							}
							case "w" ->{
								System.out.println("↑上に進みました");
								if(map[myX-1][myY]==0||map[myX-1][myY]==2) {
									myX--;
									if(map[myX][myY]==2) {
										System.out.println("おめでとう！ダンジョンをクリアしました！");
									}
								}else {
									System.out.println("×そちらは壁でした");
								}
							}
							case "d" ->{
								System.out.println("→右にすすみました");
								if(map[myX][myY+1]==0||map[myX][myY+1]==2) {
									myY++;
									if(map[myX][myY]==2) {
										System.out.println("おめでとう！ダンジョンをクリアしました！");
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
	}
}
