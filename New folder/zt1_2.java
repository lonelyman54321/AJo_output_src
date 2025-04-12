/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.instream.video.InstreamVideo;
import com.jio.jioads.util.Utility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from zt1
 */
public final class zt1_2
extends Lambda
implements Function0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zt1_2(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        int n3 = this.c;
        switch (n3) {
            default: {
                Utility utility = Utility.INSTANCE;
                String string2 = InstreamVideo.access$getIJioAdView$p((InstreamVideo)this.d).P();
                return utility.getCcbValue(string2);
            }
            case 0: 
        }
        nz0_2 nz0_22 = fh1_2.f();
        iS2 iS22 = (iS2)this.d;
        rt1_0 rt1_02 = new rt1_0(iS22, nz0_22);
        return rt1_02;
    }
}

