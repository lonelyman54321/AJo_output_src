/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 */
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$a;
import com.skydoves.balloon.Balloon$b;
import com.skydoves.balloon.R$anim;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uu
 */
public final class uu_2
implements Runnable {
    public final /* synthetic */ Balloon a;

    public /* synthetic */ uu_2(Balloon balloon2) {
        this.a = balloon2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        int n3;
        Object object;
        Balloon balloon2;
        block11: {
            block15: {
                block16: {
                    int n4;
                    int n7;
                    int n8;
                    int[] nArray;
                    int n10;
                    block12: {
                        block14: {
                            block13: {
                                balloon2 = this.a;
                                Intrinsics.checkNotNullParameter(balloon2, "this$0");
                                object = balloon2.b;
                                n3 = ((Balloon$a)object).S;
                                n10 = -1 << -1;
                                if (n3 != n10) break block11;
                                nArray = Balloon$b.$EnumSwitchMapping$4;
                                wu_2 wu_22 = ((Balloon$a)object).R;
                                n10 = wu_22.ordinal();
                                n3 = nArray[n10];
                                n10 = 4;
                                n8 = 3;
                                n7 = 2;
                                n4 = 1;
                                if (n3 == n4) break block12;
                                if (n3 == n7) break block13;
                                if (n3 != n8) {
                                    return;
                                }
                                n3 = R$anim.balloon_fade;
                                break block11;
                            }
                            object = ((Balloon$a)object).p;
                            nArray = Balloon$b.$EnumSwitchMapping$0;
                            int n14 = ((Enum)object).ordinal();
                            if ((n14 = nArray[n14]) == n4) break block14;
                            if (n14 != n7) {
                                if (n14 != n8) {
                                    if (n14 != n10) {
                                        object = new NoWhenBranchMatchedException();
                                        throw object;
                                    }
                                    n3 = R$anim.balloon_shake_left;
                                    break block11;
                                } else {
                                    n3 = R$anim.balloon_shake_right;
                                }
                                break block11;
                            } else {
                                n3 = R$anim.balloon_shake_bottom;
                            }
                            break block11;
                        }
                        n3 = R$anim.balloon_shake_top;
                        break block11;
                    }
                    n3 = (int)(((Balloon$a)object).j ? 1 : 0);
                    if (n3 == 0) break block15;
                    object = ((Balloon$a)object).p;
                    nArray = Balloon$b.$EnumSwitchMapping$0;
                    int n15 = ((Enum)object).ordinal();
                    if ((n15 = nArray[n15]) == n4) break block16;
                    if (n15 != n7) {
                        if (n15 != n8) {
                            if (n15 != n10) {
                                object = new NoWhenBranchMatchedException();
                                throw object;
                            }
                            n3 = R$anim.balloon_heartbeat_left;
                            break block11;
                        } else {
                            n3 = R$anim.balloon_heartbeat_right;
                        }
                        break block11;
                    } else {
                        n3 = R$anim.balloon_heartbeat_bottom;
                    }
                    break block11;
                }
                n3 = R$anim.balloon_heartbeat_top;
                break block11;
            }
            n3 = R$anim.balloon_heartbeat_center;
        }
        object = AnimationUtils.loadAnimation((Context)balloon2.a, (int)n3);
        if (object == null) return;
        balloon2 = balloon2.c.b;
        balloon2.startAnimation((Animation)object);
    }
}

