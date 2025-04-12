/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodecInfo$VideoCapabilities
 *  android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint
 */
package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.exoplayer.mediacodec.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;

public final class f$a {
    /*
     * WARNING - void declaration
     */
    public static int a(boolean bl2) {
        block36: {
            int n3;
            Object object;
            Object object2;
            Object object3;
            block38: {
                block37: {
                    object3 = new d$a();
                    object2 = "video/avc";
                    object2 = ip1_0.l((String)object2);
                    ((d$a)object3).n = object2;
                    object2 = new d((d$a)object3);
                    object3 = ((d)object2).o;
                    if (object3 == null) break block36;
                    object3 = MediaCodecUtil.e((String)object3, bl2, false);
                    object2 = MediaCodecUtil.b((d)object2);
                    if (object2 != null) break block37;
                    object = ImmutableList.of();
                    break block38;
                }
                object = MediaCodecUtil.e((String)object2, bl2, false);
            }
            object2 = ImmutableList.builder();
            object3 = ((ImmutableList$Builder)object2).addAll((Iterable)object3);
            object = ((ImmutableList$Builder)object3).addAll((Iterable)object);
            try {
                object = ((ImmutableList$Builder)object).build();
                n3 = 0;
                object3 = null;
            }
            catch (MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException) {}
            while (true) {
                block39: {
                    void var0_3;
                    block40: {
                        int n4 = object.size();
                        if (n3 >= n4) break block36;
                        object2 = object.get(n3);
                        object2 = (e)object2;
                        object2 = ((e)object2).d;
                        if (object2 == null) break block39;
                        object2 = object.get(n3);
                        object2 = (e)object2;
                        object2 = ((e)object2).d;
                        object2 = object2.getVideoCapabilities();
                        if (object2 == null) break block39;
                        object2 = object.get(n3);
                        object2 = (e)object2;
                        object2 = ((e)object2).d;
                        object2 = object2.getVideoCapabilities();
                        object2 = HL1.a((MediaCodecInfo.VideoCapabilities)object2);
                        if (object2 == null) break block39;
                        int n7 = object2.isEmpty();
                        if (n7 != 0) break block39;
                        LL1.a();
                        object = KL1.a();
                        n3 = 0;
                        object3 = null;
                        while (true) {
                            n7 = object2.size();
                            if (n3 >= n7) break;
                            Object object4 = object2.get(n3);
                            object4 = IL1.a(object4);
                            n7 = (int)(JL1.a(object4, (MediaCodecInfo.VideoCapabilities.PerformancePoint)object) ? 1 : 0);
                            if (n7 != 0) {
                                int n8 = 2;
                                break block40;
                            }
                            ++n3;
                            continue;
                            break;
                        }
                        boolean bl3 = true;
                    }
                    return (int)var0_3;
                }
                ++n3;
            }
        }
        return 0;
    }
}

