/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.R$animator;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.FragmentAnim$a;
import androidx.fragment.app.b$f;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import kotlin.jvm.internal.Intrinsics;

public final class b$b
extends b$f {
    public final boolean b;
    public boolean c;
    public FragmentAnim$a d;

    public b$b(n$c n$c, boolean bl2) {
        Intrinsics.checkNotNullParameter(n$c, "operation");
        super(n$c);
        this.b = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final FragmentAnim$a b(Context object) {
        void var1_10;
        boolean bl2;
        void var1_11;
        block12: {
            block10: {
                void var5_24;
                block11: {
                    int n3;
                    Object object2;
                    int n4;
                    block15: {
                        block21: {
                            block16: {
                                block17: {
                                    block18: {
                                        block19: {
                                            block20: {
                                                int n7;
                                                block14: {
                                                    block13: {
                                                        LayoutTransition layoutTransition;
                                                        ViewGroup viewGroup;
                                                        int n8;
                                                        Object object3;
                                                        String string2 = "context";
                                                        Intrinsics.checkNotNullParameter(object, string2);
                                                        n4 = this.c;
                                                        if (n4 != 0) {
                                                            FragmentAnim$a fragmentAnim$a = this.d;
                                                            return var1_11;
                                                        }
                                                        n$c n$c = this.a;
                                                        object2 = n$c.c;
                                                        n$c$b n$c$b = n$c.a;
                                                        n$c$b n$c$b2 = n$c$b.VISIBLE;
                                                        Object var6_26 = null;
                                                        bl2 = true;
                                                        if (n$c$b == n$c$b2) {
                                                            n4 = 1;
                                                        } else {
                                                            n4 = 0;
                                                            Object var2_15 = null;
                                                        }
                                                        n7 = ((Fragment)object2).getNextTransition();
                                                        n3 = this.b;
                                                        n3 = n3 != 0 ? (n4 != 0 ? ((Fragment)object2).getPopEnterAnim() : ((Fragment)object2).getPopExitAnim()) : (n4 != 0 ? ((Fragment)object2).getEnterAnim() : ((Fragment)object2).getExitAnim());
                                                        ((Fragment)object2).setAnimations(0, 0, 0, 0);
                                                        ViewGroup viewGroup2 = ((Fragment)object2).mContainer;
                                                        if (viewGroup2 != null && (object3 = viewGroup2.getTag(n8 = R$id.visible_removing_fragment_view_tag)) != null) {
                                                            ViewGroup viewGroup3 = ((Fragment)object2).mContainer;
                                                            n8 = R$id.visible_removing_fragment_view_tag;
                                                            viewGroup3.setTag(n8, null);
                                                        }
                                                        if ((viewGroup = ((Fragment)object2).mContainer) != null && (layoutTransition = viewGroup.getLayoutTransition()) != null) break block10;
                                                        Animation animation = ((Fragment)object2).onCreateAnimation(n7, n4 != 0, n3);
                                                        if (animation == null) break block13;
                                                        FragmentAnim$a fragmentAnim$a = new FragmentAnim$a(animation);
                                                        break block12;
                                                    }
                                                    if ((object2 = ((Fragment)object2).onCreateAnimator(n7, n4 != 0, n3)) == null) break block14;
                                                    FragmentAnim$a fragmentAnim$a = new FragmentAnim$a((Animator)object2);
                                                    break block12;
                                                }
                                                if (n3 != 0 || n7 == 0) break block15;
                                                int n10 = 4097;
                                                if (n7 == n10) break block16;
                                                n10 = 8194;
                                                if (n7 == n10) break block17;
                                                n10 = 8197;
                                                if (n7 == n10) break block18;
                                                n10 = 4099;
                                                if (n7 == n10) break block19;
                                                n10 = 4100;
                                                if (n7 == n10) break block20;
                                                n4 = -1;
                                                n3 = -1;
                                                break block15;
                                            }
                                            n4 = n4 != 0 ? FragmentAnim.a(16842936, object) : FragmentAnim.a(16842937, object);
                                            break block21;
                                        }
                                        n4 = n4 != 0 ? R$animator.fragment_fade_enter : R$animator.fragment_fade_exit;
                                        break block21;
                                    }
                                    n4 = n4 != 0 ? FragmentAnim.a(16842938, object) : FragmentAnim.a(0x10100BB, object);
                                    break block21;
                                }
                                n4 = n4 != 0 ? R$animator.fragment_close_enter : R$animator.fragment_close_exit;
                                break block21;
                            }
                            n4 = n4 != 0 ? R$animator.fragment_open_enter : R$animator.fragment_open_exit;
                        }
                        n3 = n4;
                    }
                    if (n3 == 0) break block10;
                    object2 = "anim";
                    String string3 = object.getResources().getResourceTypeName(n3);
                    n4 = (int)(((String)object2).equals(string3) ? 1 : 0);
                    if (n4 != 0) {
                        try {
                            object2 = AnimationUtils.loadAnimation((Context)object, (int)n3);
                            if (object2 == null) break block10;
                            FragmentAnim$a fragmentAnim$a = new FragmentAnim$a((Animation)object2);
                            break block11;
                        }
                        catch (Resources.NotFoundException notFoundException) {
                            throw notFoundException;
                        }
                        catch (RuntimeException runtimeException) {}
                    }
                    try {
                        object2 = AnimatorInflater.loadAnimator((Context)object, (int)n3);
                        if (object2 == null) break block10;
                        FragmentAnim$a fragmentAnim$a = new FragmentAnim$a((Animator)object2);
                    }
                    catch (RuntimeException runtimeException) {
                        FragmentAnim$a fragmentAnim$a;
                        if (n4 != 0) throw runtimeException;
                        Animation animation = AnimationUtils.loadAnimation((Context)object, (int)n3);
                        if (animation == null) break block10;
                        FragmentAnim$a fragmentAnim$a2 = fragmentAnim$a = new FragmentAnim$a(animation);
                        break block12;
                    }
                }
                void var1_7 = var5_24;
                break block12;
            }
            Object var1_4 = null;
        }
        this.d = var1_10;
        this.c = bl2;
        return var1_11;
    }
}

