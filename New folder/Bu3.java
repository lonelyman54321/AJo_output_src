/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HotSpotT;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Bu3
implements Function1 {
    public final /* synthetic */ g71_0 a;
    public final /* synthetic */ BannerData b;

    public /* synthetic */ Bu3(g71_0 g71_02, BannerData bannerData) {
        this.a = g71_02;
        this.b = bannerData;
    }

    public final Object invoke(Object iterator) {
        iterator = (Context)iterator;
        BannerData bannerData = this.b;
        Intrinsics.checkNotNullParameter(bannerData, "$bannerBuilderData");
        Object object = "context";
        Intrinsics.checkNotNullParameter(iterator, (String)object);
        ConstraintLayout constraintLayout = new ConstraintLayout((Context)iterator);
        g71_0 g71_02 = this.a;
        if (g71_02 != null) {
            HotSpotT hotSpotT;
            boolean bl2;
            int n3;
            iterator = hv3_0.a;
            iterator.getClass();
            int n4 = (int)((double)hv3_0.E() * 0.6);
            double d2 = bannerData.getWidth();
            double d5 = bannerData.getHeight();
            d2 /= d5;
            int n7 = hv3_0.F();
            int n8 = mz3_0.d(16) * 2;
            bannerData.setWidth(n7 -= n8);
            d5 = (double)bannerData.getWidth() / d2;
            n7 = (int)d5;
            bannerData.setHeight(n7);
            n7 = bannerData.getHeight();
            if (n7 > n4) {
                bannerData.setHeight(n4);
            }
            iterator = bannerData.getHotspots();
            object = new ArrayList();
            Object object2 = iterator;
            object2 = (Collection)((Object)iterator);
            if (object2 != null && (n3 = object2.isEmpty()) == 0) {
                iterator = ((Iterable)((Object)iterator)).iterator();
                n3 = 0;
                object2 = null;
                while (bl2 = iterator.hasNext()) {
                    hotSpotT = (HotSpotT)iterator.next();
                    n8 = n3 + 1;
                    if (n3 >= 0) {
                        int n10;
                        hotSpotT = hotSpotT;
                        d5 = hotSpotT.getWidth();
                        double d7 = hotSpotT.getHeight();
                        d5 /= d7;
                        n3 = hotSpotT.getWidth();
                        if (n3 > (n10 = bannerData.getWidth())) {
                            n3 = bannerData.getWidth();
                            hotSpotT.setWidth(n3);
                        }
                        d7 = (double)hotSpotT.getWidth() / d5;
                        n3 = (int)d7;
                        hotSpotT.setHeight(n3);
                        n3 = hotSpotT.getHeight();
                        int n14 = bannerData.getHeight();
                        if (n3 > n14) {
                            n3 = bannerData.getHeight();
                            hotSpotT.setHeight(n3);
                        }
                        ((ArrayList)object).add(hotSpotT);
                        n3 = n8;
                        continue;
                    }
                    xx_2.n();
                    throw null;
                }
                bannerData.setHotspots((List)object);
            }
            n3 = 0;
            object2 = null;
            bl2 = false;
            hotSpotT = null;
            n8 = 40;
            object = constraintLayout;
            V81.c(constraintLayout, bannerData, g71_02, null, null, n8);
        }
        return constraintLayout;
    }
}

