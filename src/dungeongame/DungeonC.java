
public class DungeonC {

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

				// ***** マップの表示処理 ***** //
				//  map[][]の値が0…"・" (通路)
				//  map[][]の値が1…"■" (かべ)

				for(int i = 0;i<map.length;i++) {
					for(int j = 0; j<map.length;j++) {
						if(map[i][j]== 0) {
							System.out.print("・");
						}else if(map[i][j]==1){
							System.out.print("■");
						}else if(map[i][j]==2) {
							System.out.print("％");
						}
				    }
					System.out.println("");
				}
	}

}
