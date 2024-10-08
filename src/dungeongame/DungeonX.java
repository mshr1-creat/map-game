package dungeongame;

public class DungeonX {
	public static void main(String[] args) {
		// *** マップ用2次元配列の宣言＋作成＋初期化 *** //
				int[][] map =	{{ 1, 1, 1, 1, 1, 1, 1, 1, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 4, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
						 		{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
						 		{ 1, 0, 0, 0, 0, 0, 0, 2, 1 },		
						 		{ 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
				
				int[][] map2 =	{{ 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				 				{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
				 				{ 1, 0, 1, 1, 1, 1, 1, 0, 1 },
				 				{ 1, 0, 1, 4, 0, 0, 0, 0, 1 },
				 				{ 1, 0, 1, 1, 1, 1, 1, 1, 1 },
				 				{ 1, 0, 1, 0, 0, 0, 0, 0, 1 },
				 				{ 1, 0, 1, 0, 1, 0, 1, 1, 1 },
				 				{ 1, 0, 0, 0, 1, 0, 0, 2, 1 },
				 				{ 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
				
				int[][] map3 =	{{ 1, 1, 1, 1, 1, 1, 1, 1, 1 },
		 						{ 1, 0, 0, 0, 0, 0, 0, 0, 1 },
		 						{ 1, 0, 1, 1, 0, 1, 1, 0, 1 },
		 						{ 1, 0, 0, 0, 0, 0, 1, 0, 1 },
		 						{ 1, 0, 1, 1, 4, 1, 1, 1, 1 },
		 						{ 1, 0, 1, 0, 0, 0, 0, 0, 1 },
		 						{ 1, 0, 1, 0, 1, 0, 1, 0, 1 },
		 						{ 1, 0, 0, 0, 0, 4, 0, 2, 1 },
		 						{ 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
				int[][] map4 =	{{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
								{ 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
								{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
								{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 4, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1},
								{ 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 2, 1}, 								
								{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
				
				int[][] map5 =  {{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
								{ 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
								{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
								{ 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
								{ 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1},
								{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 4, 2, 1},
								{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
				
				// 挑戦するマップを選択
				System.out.println("挑戦するマップを選択してください（1～3）");
				int input = new java.util.Scanner(System.in).nextInt();
				if(input==1) {
					DungeonMap1.Map1(map);
					DungeonBonusStage.Map4(map4);
				}else if(input==2) {
					DungeonMap2.Map2(map2);
					DungeonBonusStage.Map4(map4);
				}else if(input==3) {
					DungeonMap3.Map3(map3);
					DungeonBonusStage.Map4(map4);
					DungeonFinalStage.Map5(map5);
				}else {
					System.out.println("1～3の値を入力してください。");
				}

	}	
}
