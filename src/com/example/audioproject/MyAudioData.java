package com.example.audioproject;

// 노래 정보 저장하기 위한 클래스
public class MyAudioData {
	private int imageId;	// 앨범이미지정보
	private int songId;		// 노래 파일
	private String songName; // 노래 이름 정보
	private String artistName;	// 가수 이름 정보
	
	// 생성자
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
