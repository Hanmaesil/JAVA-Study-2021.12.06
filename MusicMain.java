import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // 음악을 재생시켜줄 객체
		ArrayList<Music> MusicList = new ArrayList<Music>();

//		MusicList.add(new Music("깡", "Rain", 100,"C://music/Rain - 깡.mp3"));
//		MusicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
//		MusicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
//		int index = 0; // 현재 노래 위치정보
		MusicPlayer player = new MusicPlayer(); // controller 불러와서 실행시키기. //기능을 담당하는 객체
		while (true) {

			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료  >>");
			int inputNum = sc.nextInt();

			if (inputNum == 1) {

//				mp3.play(MusicList.get(index).getPath()); //play(음악파일이 위치한 경로) ->> 재생 메소드

//				MusicList.get(index).show();  //music에 있는 메소드
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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}

		}

	}

	private static void show(ArrayList<Music> MusicList, int index) {
		System.out.println("=====현재 재생중인 노래=====");
		System.out.print(MusicList.get(index).getMusicName() + " ");
		System.out.print(MusicList.get(index).getSinger() + " ");
		if (MusicList.get(index).getPlayTime() % 60 != 0) {
			System.out.println(
					MusicList.get(index).getPlayTime() / 60 + "분" + MusicList.get(index).getPlayTime() % 60 + "초");
		} else {
			System.out.println(MusicList.get(index).getPlayTime() / 60 + "분");
		}
	}

}
