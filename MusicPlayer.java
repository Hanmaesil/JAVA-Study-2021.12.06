import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	// Controller : 실질적인 기능이 수행될 클래스.

	ArrayList<Music> MusicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;

	public MusicPlayer() {
		MusicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
		MusicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3"));
		MusicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
	}

	// 재생기능 빼주기.
	public void play() {
		mp3.play(MusicList.get(index).getPath()); // play(음악파일이 위치한 경로) ->> 재생 메소드
	}
	
	//노래 정지
	
	public void stopMusic() {
		mp3.stop();
		System.out.println("음악을 종료합니다.");
	}

	// 다음곡을 실행할 기능.
	public void nextPlay() {
		if (mp3.isPlaying()) { // 현재 재생중인 노래가 있다면 true로 반환, 아니라면 false 반환
			mp3.stop();
		}

		index++;
		if (index >= MusicList.size() - 1) {
			mp3.stop();
			System.out.println("재생할 곡이 없습니다.");
		} else {
//				MusicList.get(index).show();
			mp3.play(MusicList.get(index).getPath());
		}
		
		if (index > MusicList.size() - 1) {
			index--;
		}

	}
	//전 노래 재생
	
	public void beforePlay() {
		if(mp3.isPlaying()) { //현재 재생중인 노래가 있다면 true로 반환, 아니라면 false 반환
			mp3.stop();
			}
		index--;

		if (index < MusicList.size() - 1 && index >= 0) {
//			MusicList.get(index).show();
			mp3.play(MusicList.get(index).getPath());
		} else if (index < 0) {
			System.out.println("이전곡이 없습니다.");
			index++;
		}
	}

	
	
	
	
}

