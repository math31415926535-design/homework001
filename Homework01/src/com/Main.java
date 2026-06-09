package com;

public class Main {	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game1=new Game(); // 創建一局新的遊戲
		System.out.println(game1.getDeck()[3]); // 第4張牌的記憶體位址
//		game1.shuffle_01(); //洗牌
//		game1.shuffle_02(); //洗牌
//		game1.deal(); // 發牌
		System.out.println(game1.getDeck()[3]); // 第4張牌的記憶體位址
		for(Card c:game1.getDeck()) // 依序輸出牌堆每張牌的資訊
		{
			System.out.println(c.getName()+"\t"+c.getNumber()+"\t"+c.getPoint()+"\t"+c.getPosition());
		}
		game1.getPlayer()[0].setName("黃畫畫");
		game1.getPlayer()[1].setName("LeeFour");
		
		for(Player player:game1.getPlayer())
		{
			System.out.println(player.getName());
//			System.out.println();
			player.sort_hand_suits();
			for(Card card:player.getHand())
			{
				System.out.println("\t"+card.getName()+"\t"+card.getNumber()+"\t"+card.getPoint()+"\t"+card.getPosition());
			}
		}
		System.out.println();
		for(Player player:game1.getPlayer())
		{
			System.out.println(player.getName());
//			System.out.println();
			player.sort_hand_suits();
			for(Card card:player.getHand())
			{
				System.out.println("\t"+card.getName()+"\t"+card.getNumber()+"\t"+card.getPoint()+"\t"+card.getPosition());
			}
		}
//		game1.getPlayer()[0].sort_hand_suits();
		game1.getPlayer()[0].choose_hand();
		game1.getPlayer()[1].choose_hand();
		for(int p=0;p<game1.getPlayer().length;p++)
		{
			System.out.println(game1.getPlayer()[p].getName());
			for(int i=0;i<3;i++)
			{
				game1.getPlayer()[p].getRounds()[i].determine_hand();	//第1局遊戲，第0號玩家，第i輪出牌，判斷此牌型
				System.out.println("\t"+game1.getPlayer()[p].getRounds()[i].getHand_type());	// 印出，第一局遊戲，第0號玩家，第i輪，手牌牌型
				Sort.sort_depends_on_suit_decreasing(game1.getPlayer()[p].getRounds()[i].getRound_hand());
				Sort.sort_depends_on_point_decreasing(game1.getPlayer()[p].getRounds()[i].getRound_hand());
				if(i!=0) Sort.sort_depends_on_duplicate_number_decreasing(game1.getPlayer()[p].getRounds()[i].getRound_hand());
				for(int j=0;j<game1.getPlayer()[p].getRounds()[i].getRound_hand().length;j++)
				{
					System.out.println("\t"+game1.getPlayer()[p].getRounds()[i].getRound_hand()[j].getName()+"\t"); // 印出，第一局遊戲，第0號玩家，第i輪，本輪出牌的第j張牌，此牌名稱
				}
			}
		}
		for(int p=0;p<game1.getPlayer().length;p++)
		{
			System.out.println(game1.getPlayer()[p].getName());
			for(int i=0;i<game1.getPlayer()[0].getRounds().length;i++)
			{
				game1.getPlayer()[p].getRounds()[i].determine_hand();
				game1.getPlayer()[p].getRounds()[i].determine_hand_strength();
				System.out.printf("%s\t%012d%n",game1.getPlayer()[p].getRounds()[i].getHand_type(), game1.getPlayer()[p].getRounds()[i].getHand_strength());
			}
		}
		System.out.println();
		System.out.println(game1.stage_message(8));
//		System.out.println("123"); // 分界線
//		game1.shuffle(); //洗牌
//		for(int i=0;i<52;i++) // 檢查每張牌的位置
//		{
//			System.out.println("name:\t"+game1.getDeck()[i].getName()+"\tposition:\t"+game1.getDeck()[i].getPosition());
//		}
//		System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
//		game1.shuffle(); //洗牌
//		for(int i=0;i<52;i++) // 檢查每張牌的位置
//		{
//			System.out.println("name:\t"+game1.getDeck()[i].getName()+"\tposition:\t"+game1.getDeck()[i].getPosition());
//		}
//		System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
//		game1.shuffle(); //洗牌
//		for(int i=0;i<52;i++) // 檢查每張牌的位置
//		{
//			System.out.println("name:\t"+game1.getDeck()[i].getName()+"\tposition:\t"+game1.getDeck()[i].getPosition());
//		}
		
//		System.out.println("321"); // 分界線
//		System.out.println("Math.random()=\t"+Math.random()); // 確認Math.random()的範圍
//		for(int i=0;i<52;i++) // 測試class中class資料get/set的語法
//		{
////			game1.getCards()[i].setNumber(i+1);
////			System.out.println(game1.getCards()[i].getNumber());
//			System.out.println(game1.getCards()[i].getName());
//		}
//		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"); // 分界線
	}

}
