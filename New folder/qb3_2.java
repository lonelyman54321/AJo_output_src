/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;

/*
 * Renamed from QB3
 */
public final class qb3_2 {
    public static final boolean a;
    public static final boolean b;
    public static final rb3_1 c;

    static {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        Object object;
        String string2;
        block9: {
            String string3;
            block8: {
                string3 = "com.google.android.exoplayer2.source.hls.HlsMediaSource";
                string2 = "com.google.android.exoplayer2.ui.StyledPlayerView";
                object = xx_2.i("com.google.android.exoplayer2.ExoPlayer", string3, string2).iterator();
                while (true) {
                    bl4 = object.hasNext();
                    bl3 = true;
                    if (!bl4) break;
                    string3 = (String)object.next();
                    try {
                        Class.forName(string3);
                    }
                    catch (Throwable throwable) {
                        com.clevertap.android.sdk.b.c();
                        com.clevertap.android.sdk.b.c();
                        bl2 = false;
                        object = null;
                        break block8;
                    }
                }
                com.clevertap.android.sdk.b.c();
                bl2 = true;
            }
            a = bl2;
            string3 = "androidx.media3.exoplayer.hls.HlsMediaSource";
            String string4 = "androidx.media3.ui.PlayerView";
            object = xx_2.i("androidx.media3.exoplayer.ExoPlayer", string3, string4).iterator();
            while (bl4 = object.hasNext()) {
                string3 = (String)object.next();
                try {
                    Class.forName(string3);
                }
                catch (Throwable throwable) {
                    com.clevertap.android.sdk.b.c();
                    com.clevertap.android.sdk.b.c();
                    bl2 = false;
                    object = null;
                    break block9;
                }
            }
            com.clevertap.android.sdk.b.c();
            bl2 = true;
        }
        bl4 = a;
        if (!bl2 && !bl4) {
            com.clevertap.android.sdk.b.c();
        }
        if (!bl4 && !bl2) {
            bl3 = false;
            string2 = null;
        }
        b = bl3;
        object = bl2 ? rb3_1.MEDIA3 : (bl4 ? rb3_1.EXOPLAYER : rb3_1.NONE);
        c = object;
    }
}

