package com.netease.music.data.config;

public enum TYPE {


    PLAYLIST("歌单", 0x01),
    MV("MV", 0x02),
    ALBUM("专辑", 0x03),
    RADIO("电台", 0x04),
    VIDEO("视频", 0x05),
    EVENT("动态", 0x06),
    SONG("歌曲", 0x06);

    //所有类型标识
    public static final int PLAYLIST_ID = 0x01;
    public static final int MV_ID = 0x02;
    public static final int ALBUM_ID = 0x03;
    public static final int RADIO_ID = 0x04;
    public static final int VIDEO_ID = 0x05;
    public static final int EVENT_ID = 0x06;
    public static final int SONG_ID = 0x07;


    private final String key;
    private final int value;

    TYPE(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }


    public static TYPE getTypeByID(int id) {
        switch (id) {
            case PLAYLIST_ID:
                return PLAYLIST;
            case MV_ID:
                return MV;
            case ALBUM_ID:
                return ALBUM;
            case RADIO_ID:
                return RADIO;
            case VIDEO_ID:
                return VIDEO;
            case EVENT_ID:
                return EVENT;
            case SONG_ID:
                return SONG;
        }
        throw new IllegalArgumentException("cannot find type");
    }

}
