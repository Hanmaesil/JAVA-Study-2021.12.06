import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // ������ ��������� ��ü
		ArrayList<Music> MusicList = new ArrayList<Music>();

//		MusicList.add(new Music("��", "Rain", 100,"C://music/Rain - ��.mp3"));
//		MusicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
//		MusicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
//		int index = 0; // ���� �뷡 ��ġ����
		MusicPlayer player = new MusicPlayer(); // controller �ҷ��ͼ� �����Ű��. //����� ����ϴ� ��ü
		while (true) {

			System.out.print("1.��� 2.���� 3.������ 4.������ 5.����  >>");
			int inputNum = sc.nextInt();

			if (inputNum == 1) {

//				mp3.play(MusicList.get(index).getPath()); //play(���������� ��ġ�� ���) ->> ��� �޼ҵ�

//				MusicList.get(index).show();  //music�� �ִ� �޼ҵ�
				show(player.MusicList, player.index);
				player.play();
			}

			else if (inputNum == 2) {
				player.stopMusic(); // == player.mp3.stop();
			}

			else if (inputNum == 3) {

				player.nextPlay();
				show(player.MusicList, player.index);
			}

			else if (inputNum == 4) {
				player.beforePlay();
				show(player.MusicList, player.index);
			}

			else if (inputNum == 5) {
				player.mp3.stop();
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}

		}

	}

	private static void show(ArrayList<Music> MusicList, int index) {
		System.out.println("=====���� ������� �뷡=====");
		System.out.print(MusicList.get(index).getMusicName() + " ");
		System.out.print(MusicList.get(index).getSinger() + " ");
		if (MusicList.get(index).getPlayTime() % 60 != 0) {
			System.out.println(
					MusicList.get(index).getPlayTime() / 60 + "��" + MusicList.get(index).getPlayTime() % 60 + "��");
		} else {
			System.out.println(MusicList.get(index).getPlayTime() / 60 + "��");
		}
	}

}
