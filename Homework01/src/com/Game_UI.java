package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

public class Game_UI extends JFrame {
	boolean sort_switch_flag = true;
	public String SwitchSortOut_1 = "";

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	private static final double GOLDEN_RATIO = (1 + Math.sqrt(5)) / 2;
	private static final int BUTTON_HIGH_DIFFERENCE=40;
	private static final int BUTTON_WIDTH_DIFFERENCE=30;
	private final ButtonGroup buttonGroup_array[]=new ButtonGroup[15];
	private final JRadioButton choose_hand_buttons[][]=new JRadioButton[15][4];
	private JTextField change_name_0_text_field;
	private JTextField change_name_1_text_field;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game_UI frame = new Game_UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game_UI() {
		
		setTitle("田忌撲克");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int JPanel_high = 800;
		setBounds(100, 30, (int) (JPanel_high * GOLDEN_RATIO), JPanel_high);
//		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 235, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 64, 0)));
		panel_1.setBackground(new Color(130, 173, 253));
		panel_1.setBounds(10, 10, 990, 280);
		contentPane.add(panel_1);
		panel_1.setLayout(null);


		JPanel panel = new JPanel();
		panel.setBounds(1010, 10, 260, 740);
		contentPane.add(panel);
		panel.setBorder(new LineBorder(new Color(0, 64, 0)));
		panel.setBackground(new Color(130, 173, 253));
		panel.setLayout(null);
		
		JLabel player_0_name_label = new JLabel("玩家一");
		player_0_name_label.setFont(new Font("Monospaced", Font.BOLD, 20));
		player_0_name_label.setHorizontalAlignment(SwingConstants.CENTER);
		player_0_name_label.setBounds(10, 38, 90, 25);
		panel.add(player_0_name_label);
		
		JTextArea rule_text_area = new JTextArea();
		rule_text_area.setBackground(new Color(203, 221, 254));
		rule_text_area.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		rule_text_area.setEditable(false);
		rule_text_area.setBounds(10, 10, 870, 260);
		panel_1.add(rule_text_area);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 64, 0)));
		panel_2.setBackground(new Color(130, 173, 253));
		panel_2.setBounds(10, 300, 990, 450);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		change_name_0_text_field = new JTextField();
		change_name_0_text_field.setBounds(215, 410, 90, 25);
		panel_2.add(change_name_0_text_field);
		change_name_0_text_field.setColumns(10);
		
		change_name_1_text_field = new JTextField();
		change_name_1_text_field.setBounds(630, 410, 90, 25);
		panel_2.add(change_name_1_text_field);
		change_name_1_text_field.setColumns(10);
		
		JLabel change_name_name_1_label = new JLabel("玩家二");
		change_name_name_1_label.setHorizontalAlignment(SwingConstants.CENTER);
		change_name_name_1_label.setFont(new Font("Monospaced", Font.BOLD, 20));
		change_name_name_1_label.setBounds(530, 410, 90, 25);
		panel_2.add(change_name_name_1_label);
		
		JLabel change_name_name_0_label = new JLabel("玩家一");
		change_name_name_0_label.setHorizontalAlignment(SwingConstants.CENTER);
		change_name_name_0_label.setFont(new Font("Monospaced", Font.BOLD, 20));
		change_name_name_0_label.setBounds(115, 410, 90, 25);
		panel_2.add(change_name_name_0_label);
		
		JLabel change_name_title_label = new JLabel("玩家改名:");
		change_name_title_label.setHorizontalAlignment(SwingConstants.CENTER);
		change_name_title_label.setFont(new Font("Monospaced", Font.BOLD, 20));
		change_name_title_label.setBounds(10, 410, 100, 25);
		panel_2.add(change_name_title_label);

		JTextArea system_text_area = new JTextArea();
		system_text_area.setEditable(false);
		system_text_area.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
		system_text_area.setBackground(new Color(203, 221, 254));
		system_text_area.setBounds(10, 10, 870, 390);
		panel_2.add(system_text_area);
		
		JLabel player_1_name_label = new JLabel("玩家二");
		player_1_name_label.setFont(new Font("Monospaced", Font.BOLD, 20));
		player_1_name_label.setHorizontalAlignment(SwingConstants.CENTER);
		player_1_name_label.setBounds(164, 38, 90, 25);
		panel.add(player_1_name_label);
		
		JLabel time_label = new JLabel("New label");
		time_label.setHorizontalAlignment(SwingConstants.CENTER);
		time_label.setFont(new Font("Monospaced", Font.BOLD, 15));
		time_label.setBounds(890, 379, 90, 21);
		panel_2.add(time_label);
		
		// choose card buttons top 
		for(int i=0;i<choose_hand_buttons.length;i++)
		{
			buttonGroup_array[i]=new ButtonGroup();
			for(int j=0;j<choose_hand_buttons[i].length;j++)
			{
				choose_hand_buttons[i][j]=new JRadioButton("");
				buttonGroup_array[i].add(choose_hand_buttons[i][j]);
				choose_hand_buttons[i][j].setBounds(75+BUTTON_WIDTH_DIFFERENCE*j, 120+BUTTON_HIGH_DIFFERENCE*i, 20, 20);
//				choose_hand_buttons[i][j].setFont(new Font("Monospaced", Font.BOLD, 18));
				if(j==3) choose_hand_buttons[i][j].setSelected(true);
				panel.add(choose_hand_buttons[i][j]);
				choose_hand_buttons[i][j].setEnabled(false);
			}
		}
		// choose card buttons end
		// JLabel array top
		final int HIGH_LABEL = 40;
		JLabel show_hand_label_0[] = new JLabel[15];
		for (int i = 0; i < 15; i++)
		{
			show_hand_label_0[i] = new JLabel("");
//			show_hand_label_0[i].setHorizontalAlignment(SwingConstants.CENTER);
			show_hand_label_0[i].setBounds(30, 115 + HIGH_LABEL * i, 60, 30);
			show_hand_label_0[i].setFont(new Font("Monospaced", Font.BOLD, 18));
			panel.add(show_hand_label_0[i]);
		}
		JLabel show_hand_label_1[] = new JLabel[15];
		for (int i = 0; i < 15; i++)
		{
			show_hand_label_1[i] = new JLabel("");
//			show_hand_label_1[i].setHorizontalAlignment(SwingConstants.CENTER);
			show_hand_label_1[i].setBounds(210, 115 + HIGH_LABEL * i, 60, 30);
			show_hand_label_1[i].setFont(new Font("Monospaced", Font.BOLD, 18));
			panel.add(show_hand_label_1[i]);
		}
		// JLabel array end

		// Game stuff top
		Game game[] = new Game[10];	// 每次執行最多玩10局
//		game.getPlayer()[0].choose_hand();
//		game.getPlayer()[1].choose_hand();


		// Game stuff end
		// ************************event top************************

		// 開始按鈕
		JButton start_button = new JButton("開始");
		start_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		start_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Game.getCounter()<10)
				{
					switch(Game.getStage())
					{
						case 0:
							game[Game.getCounter()]=new Game();
							Game.setStage(1);
							system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
							break;
						case 8:
							game[Game.getCounter()]=new Game();
							Game.setStage(1);
							system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
							break;
						default:
							system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
					}
				}
				else
					system_text_area.setText("最多只能遊玩十局遊戲");
			}
		});
		start_button.setBounds(890, 10, 90, 25);
		panel_2.add(start_button);
		
		// 顯示規則
		JButton rule_botton = new JButton("顯示規則");
		rule_botton.setFont(new Font("Monospaced", Font.BOLD, 12));
		rule_botton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rule_text_area.setText(Game.getRULE());
			}
		});
		rule_botton.setBounds(890, 10, 90, 25);
		panel_1.add(rule_botton);
		
		// 切換排序
		int num[]=new int[15];
		JButton sort_way_switch_botton = new JButton("切換排序");
		sort_way_switch_botton.setFont(new Font("Monospaced", Font.BOLD, 12));
//		JRadioButton j_radio_button_tmp;
		sort_way_switch_botton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(Game.getStage()==2)
				{
					for(int i=0;i<game[Game.getGame_index()].getPlayer()[0].getHand().length;i++)
					{
						game[Game.getGame_index()].getPlayer()[0].getHand()[i].setPosition(i);
					}
					for(int i=0;i<15;i++)
					{
						for(int j=0;j<4;j++)
						{
							if(choose_hand_buttons[i][j].isSelected())
								num[i]=j;
						}
					}
					if (sort_switch_flag) {
						Sort.sort_depends_on_number(game[Game.getGame_index()].getPlayer()[0].getHand());
						sort_switch_flag = false;
					} else {
						Sort.sort_depends_on_point_increasing(game[Game.getGame_index()].getPlayer()[0].getHand());
						sort_switch_flag = true;
					}

					for(int i=0;i<15;i++)
					{
						for(int j=0;j<4;j++)
						{
							if(num[game[Game.getGame_index()].getPlayer()[0].getHand()[i].getPosition()]==j)
							{
								choose_hand_buttons[i][j].setSelected(true);
							}
						}
					}
					
					
					for (int i = 0; i < game[Game.getGame_index()].getPlayer()[0].getHand().length; i++) {
						show_hand_label_0[i].setText(game[Game.getGame_index()].getPlayer()[0].getHand()[i].getName());
					}
				}
				else if(Game.getStage()==5)
				{
					for(int i=0;i<game[Game.getGame_index()].getPlayer()[1].getHand().length;i++)
					{
						game[Game.getGame_index()].getPlayer()[1].getHand()[i].setPosition(i);
					}
					for(int i=0;i<15;i++)
					{
						for(int j=0;j<4;j++)
						{
							if(choose_hand_buttons[i][j].isSelected())
								num[i]=j;
						}
					}
					if (sort_switch_flag) {
						Sort.sort_depends_on_number(game[Game.getGame_index()].getPlayer()[1].getHand());
						sort_switch_flag = false;
					} else {
						Sort.sort_depends_on_point_increasing(game[Game.getGame_index()].getPlayer()[1].getHand());
						sort_switch_flag = true;
					}
					

					for(int i=0;i<15;i++)
					{
						for(int j=0;j<4;j++)
						{
							if(num[game[Game.getGame_index()].getPlayer()[1].getHand()[i].getPosition()]==j)
							{
								choose_hand_buttons[i][j].setSelected(true);
							}
						}
					}
					
					
					for (int i = 0; i < game[Game.getGame_index()].getPlayer()[1].getHand().length; i++) {
						show_hand_label_1[i].setText(game[Game.getGame_index()].getPlayer()[1].getHand()[i].getName());
					}
				}
				else
				{
					if(game[Game.getGame_index()]==null)
						system_text_area.setText("遊戲開始階段\n"+"請按開始遊戲按鈕\n");
					else
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
				}
			}
		});
		sort_way_switch_botton.setBounds(85, 80, 90, 25);
		panel.add(sort_way_switch_botton);

		// 繼續按鈕
		JButton continue_button = new JButton("繼續");
		continue_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		continue_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(game[Game.getGame_index()]==null)
					system_text_area.setText("遊戲開始階段\n"+"請按開始遊戲按鈕\n");
				else
				{
					system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
					if(Game.getStage()==2)
					{
						for (int i = 0; i < game[Game.getGame_index()].getPlayer()[0].getHand().length; i++)
							show_hand_label_0[i].setText(game[Game.getGame_index()].getPlayer()[0].getHand()[i].getName());
					}
					else if(Game.getStage()==5)
					{

						for (int i = 0; i < game[Game.getGame_index()].getPlayer()[1].getHand().length; i++)
							show_hand_label_1[i].setText(game[Game.getGame_index()].getPlayer()[1].getHand()[i].getName());
					}
				}
			}
		});
		continue_button.setBounds(890, 40, 90, 25);
		panel_2.add(continue_button);

		// 清除按鈕
		JButton clear_button = new JButton("清除");
		clear_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
//				if(game[Game.getGame_index()]==null)
//					system_text_area.setText("遊戲開始階段\n"+"請按開始按鈕\n");
//				else
//				{
					rule_text_area.setText("");
					system_text_area.setText("");
					change_name_0_text_field.setText("");
					change_name_1_text_field.setText("");
					for (int i = 0; i < show_hand_label_0.length; i++)
						show_hand_label_0[i].setText("");
					for (int i = 0; i < show_hand_label_1.length; i++)
						show_hand_label_1[i].setText("");
//				}
			}
		});
		clear_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		clear_button.setBounds(890, 290, 90, 25);
		panel_2.add(clear_button);

		// 列印按鈕
		JButton print_button = new JButton("列印");
		print_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				try {
					system_text_area.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		print_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		print_button.setBounds(890, 320, 90, 25);
		panel_2.add(print_button);

		// 離開按鈕
		JButton exit_button = new JButton("離開");
		exit_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				System.exit(0);
			}
		});
		exit_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		exit_button.setBounds(890, 410, 90, 25);
		panel_2.add(exit_button);
		
		// 取消按鈕
		JButton cancel_button = new JButton("取消");
		cancel_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		cancel_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(Game.getStage()==3)
				{
					Game.setStage(2);
					for (int i = 0; i < game[Game.getGame_index()].getPlayer()[0].getHand().length; i++)
						show_hand_label_0[i].setText(game[Game.getGame_index()].getPlayer()[0].getHand()[i].getName());
					for(int i=0;i<choose_hand_buttons.length;i++)
						for(int j=0;j<choose_hand_buttons[i].length;j++)
							choose_hand_buttons[i][j].setEnabled(true);
				}
				if(Game.getStage()==6)
				{
					Game.setStage(5);
					for (int i = 0; i < game[Game.getGame_index()].getPlayer()[1].getHand().length; i++)
						show_hand_label_1[i].setText(game[Game.getGame_index()].getPlayer()[1].getHand()[i].getName());
					for(int i=0;i<choose_hand_buttons.length;i++)
						for(int j=0;j<choose_hand_buttons[i].length;j++)
							choose_hand_buttons[i][j].setEnabled(true);
				}
				if(game[Game.getGame_index()]==null)
					system_text_area.setText("遊戲開始階段\n"+"請按開始遊戲按鈕\n");
				else
					system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
					
			}
		});
		cancel_button.setBounds(890, 130, 90, 25);
		panel_2.add(cancel_button);
		
		// 確定按鈕
		JButton confirm_button = new JButton("確定");
		confirm_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		confirm_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{

				int r[]= {0, 0, 0, 0};
				switch(Game.getStage())
				{
					
					case 0:
						system_text_area.setText("遊戲開始階段\n"+"請按開始遊戲按鈕\n");
						break;
					case 1:
						Game.setStage(2);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						for (int i = 0; i < game[Game.getGame_index()].getPlayer()[0].getHand().length; i++)
							show_hand_label_0[i].setText(game[Game.getGame_index()].getPlayer()[0].getHand()[i].getName());
						for(int i=0;i<choose_hand_buttons.length;i++)
							for(int j=0;j<choose_hand_buttons[i].length;j++)
								choose_hand_buttons[i][j].setEnabled(true);
						sort_switch_flag=true;
						break;
					case 2:
						for(int i=0;i<r.length;i++)
							r[i]=0;
						for(int i=0;i<choose_hand_buttons.length;i++)
						{
							for(int j=0;j<choose_hand_buttons[i].length;j++)
							{
								if(choose_hand_buttons[i][j].isSelected())
								{
									r[j]+=1;
								}
							}
						}
						if(r[0]==3&&r[1]==5&&r[2]==5&&r[3]==2)
						{
							Game.setStage(3);
							for (int i = 0; i < game[Game.getGame_index()].getPlayer()[0].getHand().length; i++)
								show_hand_label_0[i].setText("");
							for(int i=0;i<choose_hand_buttons.length;i++)
								for(int j=0;j<choose_hand_buttons[i].length;j++)
									choose_hand_buttons[i][j].setEnabled(false);
							for(int i=0;i<r.length;i++)
								r[i]=0;
							for(int i=0;i<choose_hand_buttons.length;i++)
							{
								for(int j=0;j<choose_hand_buttons[i].length;j++)
								{
									if(choose_hand_buttons[i][j].isSelected())
									{
										if(j<3)
										{
												Game.getRounds_tmp()[j].getRound_hand()[r[j]].copy(game[Game.getGame_index()].getPlayer()[0].getHand()[i]);
												r[j]+=1;
										}
									}
								}
							}
							for(int i=0;i<3;i++)
								Game.getRounds_tmp()[i].determine_hand_strength();
							system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						}
						else
							system_text_area.setText("選牌錯誤\n1/2/3輪請依序選擇3/5/5張牌\n按鈕由左到右分別代表第1/2/3輪出牌，最右側則代表不出的牌");
						break;
					case 3:
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<Game.getRounds_tmp()[i].getRound_hand().length;j++)
							{
								game[Game.getGame_index()].getPlayer()[0].getRounds()[i].getRound_hand()[j].copy(Game.getRounds_tmp()[i].getRound_hand()[j]);
							}
							game[Game.getGame_index()].getPlayer()[0].getRounds()[i].determine_hand_strength();
						}
						Game.setStage(4);
						for(int i=0;i<choose_hand_buttons.length;i++)
							choose_hand_buttons[i][3].setSelected(true);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						break;
					case 4:
						Game.setStage(5);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						for (int i = 0; i < game[Game.getGame_index()].getPlayer()[1].getHand().length; i++)
							show_hand_label_1[i].setText(game[Game.getGame_index()].getPlayer()[1].getHand()[i].getName());
						for(int i=0;i<choose_hand_buttons.length;i++)
							for(int j=0;j<choose_hand_buttons[i].length;j++)
								choose_hand_buttons[i][j].setEnabled(true);
						for(int i=0;i<choose_hand_buttons.length;i++)
							choose_hand_buttons[i][3].setSelected(true);
						sort_switch_flag=true;
						break;
					case 5:
						for(int i=0;i<r.length;i++)
							r[i]=0;
						for(int i=0;i<choose_hand_buttons.length;i++)
						{
							for(int j=0;j<choose_hand_buttons[i].length;j++)
							{
								if(choose_hand_buttons[i][j].isSelected())
								{
									r[j]+=1;
								}
							}
						}
						if(r[0]==3&&r[1]==5&&r[2]==5&&r[3]==2)
						{
							Game.setStage(6);
							for (int i = 0; i < game[Game.getGame_index()].getPlayer()[1].getHand().length; i++)
								show_hand_label_1[i].setText("");
							for(int i=0;i<choose_hand_buttons.length;i++)
								for(int j=0;j<choose_hand_buttons[i].length;j++)
									choose_hand_buttons[i][j].setEnabled(false);
							for(int i=0;i<r.length;i++)
								r[i]=0;
							for(int i=0;i<choose_hand_buttons.length;i++)
							{
								for(int j=0;j<choose_hand_buttons[i].length;j++)
								{
									if(choose_hand_buttons[i][j].isSelected())
									{
										if(j<3)
										{
												Game.getRounds_tmp()[j].getRound_hand()[r[j]].copy(game[Game.getGame_index()].getPlayer()[1].getHand()[i]);
												r[j]+=1;
										}
									}
								}
							}
							for(int i=0;i<3;i++)
								Game.getRounds_tmp()[i].determine_hand_strength();
							system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						}
						else
							system_text_area.setText("1/2/3輪請依序選擇3/5/5張牌\n按鈕由左到右分別代表第1/2/3輪出牌，最右側則代表不出的牌");
						break;
					case 6:
						for(int i=0;i<3;i++)
						{
							for(int j=0;j<Game.getRounds_tmp()[i].getRound_hand().length;j++)
							{
								game[Game.getGame_index()].getPlayer()[1].getRounds()[i].getRound_hand()[j].copy(Game.getRounds_tmp()[i].getRound_hand()[j]);
							}
							game[Game.getGame_index()].getPlayer()[1].getRounds()[i].determine_hand_strength();
						}
						
						Game.setStage(7);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						for(int i=0;i<choose_hand_buttons.length;i++)
							choose_hand_buttons[i][3].setSelected(true);
						break;
					case 7:
						Game.setStage(8);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						break;
					case 8:
						Game.setStage(0);
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage()));
						break;
						
						
						
				}
					
				
				
				
				
//				for(int i=0;i<2;i++)
//					for(int j=0;j<3;j++)
//						game[Game.getGame_index()].getPlayer()[i].getRounds()[j].determine_hand_strength();
//				system_text_area.setText(game[Game.getGame_index()].stage_message(8));
			}
		});
		confirm_button.setBounds(890, 100, 90, 25);
		panel_2.add(confirm_button);
		
		JButton change_name_0_button = new JButton("確認改名");
		change_name_0_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(game[Game.getGame_index()]==null)
					system_text_area.setText("遊戲開始階段\n"+"請先按開始按鈕後再改名\n");
				else
				{
					if(change_name_0_text_field.getText().equals(""))
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage())+"\n\n名字不可為空");
					else
					{
						game[Game.getGame_index()].getPlayer()[0].setName(change_name_0_text_field.getText());
						player_0_name_label.setText(change_name_0_text_field.getText());
					}
				}
			}
		});
		change_name_0_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		change_name_0_button.setBounds(315, 410, 90, 25);
		panel_2.add(change_name_0_button);
		
		JButton change_name_1_button = new JButton("確認改名");
		change_name_1_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(game[Game.getGame_index()]==null)
					system_text_area.setText("遊戲開始階段\n"+"請先按開始按鈕後再改名\n");
				else
				{
					if(change_name_1_text_field.getText().equals(""))
						system_text_area.setText(game[Game.getGame_index()].stage_message(Game.getStage())+"\n\n名字不可為空");
					else
					{
						game[Game.getGame_index()].getPlayer()[1].setName(change_name_1_text_field.getText());
						player_1_name_label.setText(change_name_1_text_field.getText());
					}
				}
			}
		});
		change_name_1_button.setFont(new Font("Monospaced", Font.BOLD, 12));
		change_name_1_button.setBounds(730, 410, 90, 25);
		panel_2.add(change_name_1_button);
		
		DateTimeFormatter now = DateTimeFormatter.ofPattern("HH:mm:ss");
		Timer timer = new Timer(1000, e ->time_label.setText(LocalDateTime.now().format(now)));
		timer.start();
	}
}
