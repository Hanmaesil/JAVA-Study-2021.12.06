
public class Music {

	
	private String musicName; // �뷡����
	private String singer; // �����̸�
	private int playTime; // play �ð�
	private String path; // �������� ���
	

	public Music(String musicName, String singer, int playTime) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}

	// ������ �����ε�
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
		int a = playTime / 60; //��
		int b = playTime % 60; //��
		if (playTime % 60 != 0) {
			System.out.println("=====���� ������� �뷡=====");
			System.out.printf("== %s == == %s == == %d�� %d�� ==%n", musicName, singer, a, b);
		} else if (playTime % 60 == 0) {
			System.out.println("=====���� ������� �뷡=====");
			System.out.printf("== %s == == %s == == %d�� ==%n", musicName, singer, a);
		}
		
	}
}
