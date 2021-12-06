import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	// Controller : �������� ����� ����� Ŭ����.

	ArrayList<Music> MusicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		MusicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
		MusicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
		MusicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
	}

	// ������ ���ֱ�.
	public void play() {
		mp3.play(MusicList.get(index).getPath()); // play(���������� ��ġ�� ���) ->> ��� �޼ҵ�
	}
	
	//�뷡 ����
	
	public void stopMusic() {
		mp3.stop();
		System.out.println("������ �����մϴ�.");
	}

	// �������� ������ ���.
	public void nextPlay() {
		if (mp3.isPlaying()) { // ���� ������� �뷡�� �ִٸ� true�� ��ȯ, �ƴ϶�� false ��ȯ
			mp3.stop();
		}

		index++;
		if (index >= MusicList.size() - 1) {
			mp3.stop();
			System.out.println("����� ���� �����ϴ�.");
		} else {
//				MusicList.get(index).show();
			mp3.play(MusicList.get(index).getPath());
		}
		
		if (index > MusicList.size() - 1) {
			index--;
		}

	}
	//�� �뷡 ���
	
	public void beforePlay() {
		if(mp3.isPlaying()) { //���� ������� �뷡�� �ִٸ� true�� ��ȯ, �ƴ϶�� false ��ȯ
			mp3.stop();
			}
		index--;

		if (index < MusicList.size() - 1 && index >= 0) {
//			MusicList.get(index).show();
			mp3.play(MusicList.get(index).getPath());
		} else if (index < 0) {
			System.out.println("�������� �����ϴ�.");
			index++;
		}
	}

	
	
	
	
}

