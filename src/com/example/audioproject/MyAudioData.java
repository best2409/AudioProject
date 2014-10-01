package com.example.audioproject;

// �뷡 ���� �����ϱ� ���� Ŭ����
public class MyAudioData {
	private int imageId;	// �ٹ��̹�������
	private int songId;		// �뷡 ����
	private String songName; // �뷡 �̸� ����
	private String artistName;	// ���� �̸� ����
	
	// ������
	public MyAudioData(int imageId, int SongId, String songName, String artistName) {
		this.imageId = imageId;
		this.songId = SongId;
		this.songName = songName;
		this.artistName = artistName;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}	
}
