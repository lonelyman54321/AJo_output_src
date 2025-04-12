/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$e;
import androidx.media3.exoplayer.mediacodec.e;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from TL1
 */
public final class tl1_0
implements MediaCodecUtil$e,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ tl1_0(Object object) {
        this.a = object;
    }

    public int a(Object object) {
        boolean bl2;
        object = (e)object;
        object.getClass();
        d d2 = (d)this.a;
        String string2 = d2.o;
        String string3 = ((e)object).b;
        boolean bl3 = string3.equals(string2);
        int n3 = 1;
        if (!bl3 && !(bl3 = string3.equals(string2 = MediaCodecUtil.b(d2)))) {
            bl3 = false;
            string2 = null;
        } else {
            bl3 = true;
        }
        if (!bl3 || !(bl2 = ((e)object).c(d2, false))) {
            n3 = 0;
        }
        return n3;
    }

    public Object apply(Object object) {
        return (DataCallback)oj_0.a((Function1)this.a, "$tmp0", object, "p0", object);
    }
}

