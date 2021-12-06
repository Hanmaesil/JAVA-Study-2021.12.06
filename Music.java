
public class Music {

	
	private String musicName; // 노래제목
	private String singer; // 가수이름
	private int playTime; // play 시간
	private String path; // 음악파일 경로
	

	public Music(String musicName, String singer, int playTime) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}

	// 생성자 오버로딩
	public Music(String musicName, String singer, int playTime, String path) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getMusicName() {

		return musicName;
	}

	public String getSinger() {
		return singer;

	}

	public int getPlayTime() {
		return playTime;

	}
	
	public String getPath() {
		return path;
	}

	public void show() {
		int a = playTime / 60; //분
		int b = playTime % 60; //초
		if (playTime % 60 != 0) {
			System.out.println("=====현재 재생중인 노래=====");
			System.out.printf("== %s == == %s == == %d분 %d초 ==%n", musicName, singer, a, b);
		} else if (playTime % 60 == 0) {
			System.out.println("=====현재 재생중인 노래=====");
			System.out.printf("== %s == == %s == == %d분 ==%n", musicName, singer, a);
		}
		
	}
}
