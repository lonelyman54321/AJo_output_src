/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 */
import android.animation.ObjectAnimator;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yV1
 */
public final class yv1_0
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ NewAjioStoryActivity a;

    public yv1_0(NewAjioStoryActivity newAjioStoryActivity) {
        this.a = newAjioStoryActivity;
    }

    public final void onPageScrollStateChanged(int n3) {
        Object object = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                boolean bl2;
                Iterator iterator = object.Y.entrySet().iterator();
                while (bl2 = iterator.hasNext()) {
                    object = (NewAjioStoryView)((Object)iterator.next().getValue());
                    ObjectAnimator objectAnimator = ((NewAjioStoryView)((Object)object)).o;
                    if (objectAnimator != null) {
                        objectAnimator.pause();
                    }
                    if ((objectAnimator = ((NewAjioStoryView)((Object)object)).p) != null) {
                        objectAnimator.pause();
                    }
                    if ((object = ((NewAjioStoryView)((Object)object)).q) == null) continue;
                    object.pause();
                }
            }
        } else {
            Object object2 = object.Y;
            int n7 = object.y2().getCurrentItem();
            Integer n8 = n7;
            if ((object2 = ((HashMap)object2).get(n8)) != null) {
                object2 = object.Y;
                int n10 = object.y2().getCurrentItem();
                object = n10;
                object2 = ((HashMap)object2).get(object);
                Intrinsics.checkNotNull(object2);
                object2 = (NewAjioStoryView)((Object)object2);
                ((NewAjioStoryView)((Object)object2)).h();
            }
        }
    }

    public final void onPageSelected(int n3) {
        boolean bl2;
        Iterator iterator = this.a.Y.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Number number = (Number)object.getKey();
            int n4 = number.intValue();
            object = (NewAjioStoryView)((Object)object.getValue());
            if (n4 != n3) {
                ((NewAjioStoryView)((Object)object)).a();
                ((NewAjioStoryView)((Object)object)).c();
                ((NewAjioStoryView)((Object)object)).b();
                object = ((NewAjioStoryView)((Object)object)).m;
                n4 = 0;
                number = null;
                ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(0);
                continue;
            }
            ((NewAjioStoryView)((Object)object)).l();
        }
    }
}

