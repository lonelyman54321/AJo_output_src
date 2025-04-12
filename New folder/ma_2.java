/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.e;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.pdp.data.KYPSettings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ma
 */
public final class ma_2
extends ow_0 {
    public final Context c;
    public long d;
    public int e;
    public la_2 f;
    public Float g;
    public final hh3_2 h;
    public final hh3_2 i;
    public PlayerView j;
    public final zr1_1 k;
    public final zr1_1 l;
    public final zr1_1 m;
    public final Handler n;
    public final Handler o;
    public MediaItem p;
    public final ArrayList q;
    public int r;
    public boolean s;
    public bb3_1 t;
    public pb_2 u;
    public final androidx.media3.exoplayer.e v;

    public ma_2(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.c = object;
        ArrayList arrayList = Float.valueOf(0.0f);
        this.g = arrayList;
        arrayList = new ArrayList(this, 0);
        arrayList = yr1_2.b((Function0)((Object)arrayList));
        this.h = arrayList;
        arrayList = new ArrayList(this, 0);
        arrayList = yr1_2.b((Function0)((Object)arrayList));
        this.i = arrayList;
        arrayList = new ArrayList();
        this.k = arrayList;
        arrayList = new ArrayList();
        this.l = arrayList;
        arrayList = new ArrayList();
        this.m = arrayList;
        Looper looper = Looper.getMainLooper();
        arrayList = new ArrayList(looper);
        this.n = arrayList;
        looper = Looper.getMainLooper();
        arrayList = new ArrayList(looper);
        this.o = arrayList;
        this.q = arrayList = new ArrayList();
        object = ow_0.b(object);
        this.v = object;
    }

    public static /* synthetic */ void i(ma_2 ma_22, int n3, PlayerView playerView, String string2, Map hashMap, pb_2 pb_22, String string3, sb3_2 sb3_22, int n4) {
        HashMap hashMap2;
        int n7 = n4 & 8;
        HashMap hashMap3 = n7 != 0 ? (hashMap2 = new HashMap()) : hashMap;
        ma_22.h(n3, playerView, string2, hashMap3, pb_22, string3, sb3_22);
    }

    public static void n(sb3_2 sb3_22, ExoPlayer exoPlayer) {
        Long l2;
        long l3 = sb3_22 != null && (l2 = sb3_22.c) != null ? l2 : 0L;
        float f5 = sb3_22 != null ? sb3_22.f : 1.0f;
        if (exoPlayer != null) {
            exoPlayer.seekTo(0, l3);
            exoPlayer.setVolume(f5);
            exoPlayer.play();
        }
    }

    public static void p(ma_2 ma_22, ExoPlayer exoPlayer) {
        ma_22.getClass();
        if (exoPlayer != null) {
            float f5 = 1.0f;
            exoPlayer.setVolume(f5);
        }
    }

    public final void h(int n3, PlayerView playerView, String string2, Map map2, pb_2 pb_22, String string3, sb3_2 sb3_22) {
        boolean bl2;
        Object object;
        boolean bl3;
        ma_2 ma_22 = this;
        int n4 = n3;
        Object object2 = playerView;
        Object object3 = map2;
        pb_2 pb_23 = pb_22;
        String string4 = string3;
        Object object4 = sb3_22;
        Intrinsics.checkNotNullParameter(map2, "viewHolderMediaMap");
        Intrinsics.checkNotNullParameter(string3, "key");
        this.j = playerView;
        Object object5 = this.u;
        if (object5 != null && !(bl3 = Intrinsics.areEqual(object5, pb_22))) {
            object5.u4();
        }
        ma_22.u = pb_23;
        object5 = this.e(n3);
        if (object5 != null) {
            ((lt2_1)object5).d = string4;
        }
        object5 = this.a(n3);
        Object object6 = ma_22.c;
        if (object5 == null) {
            object5 = ow_0.b(object6);
        }
        Object object7 = null;
        if (object2 != null) {
            object = playerView.getPlayer();
        } else {
            bl2 = false;
            object = null;
        }
        if (!(object != null && (bl2 = Intrinsics.areEqual(object = playerView.getPlayer(), object5)) || object2 == null)) {
            ((PlayerView)((Object)object2)).setPlayer((f)object5);
        }
        ma_22.f = object = new la_2(ma_22);
        object = eb_2.e;
        boolean bl4 = ((HashMap)object).containsKey(string4);
        boolean bl5 = true;
        int n7 = 0;
        if (bl4) {
            int n8;
            object3 = object5.getCurrentMediaItem();
            if (object3 != null) {
                n8 = ((MediaItem)object3).hashCode();
            } else {
                n8 = 0;
                object3 = null;
            }
            Object v4 = ((HashMap)object).get(string4);
            if (v4 != null) {
                n7 = v4.hashCode();
            }
            if (n8 == n7 && (object3 = this.e(n3)) != null && (object3 = ((lt2_1)object3).e) != null && (n8 = ((Integer)object3).intValue()) == n4) {
                boolean bl6 = object5.isPlaying();
                if (bl6 != bl5) {
                    object2 = this.e(n3);
                    if (object2 != null) {
                        ((lt2_1)object2).a = object3 = ma_22.f;
                    }
                    if ((object2 = this.e(n3)) != null) {
                        ((lt2_1)object2).c = pb_23;
                    }
                    if ((object2 = this.e(n3)) != null) {
                        ((lt2_1)object2).e = object3 = Integer.valueOf(n3);
                    }
                    if ((object2 = ma_22.t) != null) {
                        ((bb3_1)object2).f(n4);
                    }
                    object5.play();
                }
            } else {
                object3 = ow_0.b(object6);
                object5 = this.e(n3);
                if (object5 != null && (object5 = ((lt2_1)object5).b) != null) {
                    object5.release();
                }
                if ((object5 = this.e(n3)) != null) {
                    ((lt2_1)object5).b = null;
                }
                if ((object5 = this.e(n3)) != null) {
                    ((lt2_1)object5).b = object3;
                }
                if (object2 != null) {
                    ((PlayerView)((Object)object2)).setPlayer(null);
                }
                if (object2 != null) {
                    ((PlayerView)((Object)object2)).setPlayer((f)object3);
                }
                object2 = (MediaItem)((HashMap)object).get(string4);
                ma_22.p = object2;
                long l2 = object4 != null && (object2 = ((sb3_2)object4).c) != null ? (Long)object2 : 0L;
                ma_22.d = l2;
                ma_22.o(n4, pb_23, (ExoPlayer)object3);
            }
        } else {
            Object object8;
            Object object9;
            UUID uUID;
            Object object10;
            object2 = new MediaItem$a$a();
            object4 = new MediaItem$c$a();
            List list = Collections.emptyList();
            ImmutableList immutableList = ImmutableList.of();
            object6 = new MediaItem$d$a();
            MediaItem$f mediaItem$f = MediaItem$f.a;
            Uri uri = string2 == null ? null : (object10 = Uri.parse((String)string2));
            object10 = ((MediaItem$c$a)object4).b;
            if (object10 != null && (object10 = ((MediaItem$c$a)object4).a) == null) {
                bl5 = false;
                uUID = null;
            }
            ct3.f(bl5);
            if (uri != null) {
                uUID = ((MediaItem$c$a)object4).a;
                if (uUID != null) {
                    object7 = new MediaItem$c((MediaItem$c$a)object4);
                }
                String string5 = "video";
                long l3 = -9223372036854775807L;
                object9 = object10 = new MediaItem$e(uri, string5, (MediaItem$c)object7, list, null, immutableList, null, l3);
            } else {
                object9 = null;
            }
            object7 = new MediaItem$a((MediaItem$a$a)object2);
            object2 = new MediaItem$d((MediaItem$d$a)object6);
            e e2 = androidx.media3.common.e.I;
            String string6 = "";
            ma_22.p = object4 = new MediaItem(string6, (MediaItem$b)object7, (MediaItem$e)object9, (MediaItem$d)object2, e2, mediaItem$f);
            ma_22.o(n4, pb_23, (ExoPlayer)object5);
            object2 = ma_22.p;
            if (object2 != null) {
                object8 = n3;
                object2 = ma_22.p;
                Intrinsics.checkNotNull(object2);
                object3.put(object8, object2);
            }
            object8 = ma_22.p;
            ((HashMap)object).put(string4, object8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(int n3, boolean bl2) {
        this.b = n3;
        Object object = this.a;
        boolean bl3 = ((ArrayList)object).isEmpty();
        Object object2 = this.c;
        if (bl3) {
            for (int i3 = 0; i3 < n3; ++i3) {
                zn0$d zn0$d;
                Intrinsics.checkNotNullParameter(object2, "context");
                lt2_1 lt2_12 = new lt2_1();
                Object object3 = new zn0((Context)object2);
                Object object4 = ((zn0)object3).c;
                synchronized (object4) {
                    zn0$d = ((zn0)object3).g;
                }
                zn0$d.getClass();
                object4 = new zn0$d$a(zn0$d);
                ((zn0$d$a)object4).m();
                zn0$d = new zn0$d((zn0$d$a)object4);
                ((zn0)object3).o(zn0$d);
                lt2_12.b = object3 = ow_0.b(object2);
                ((ArrayList)object).add(lt2_12);
            }
        } else if (bl2) {
            bl2 = this.s;
            if (bl2) {
                bl2 = this.r % n3;
                ExoPlayer exoPlayer = this.a((int)(bl2 ? 1 : 0));
                Object object5 = eb_2.c;
                int n4 = this.r;
                object = ow_0.d(exoPlayer, n4);
                object5 = (sb3_2)((HashMap)object5).get(object);
                ma_2.n((sb3_2)object5, exoPlayer);
            } else {
                Object object6;
                Object object7;
                n3 = this.r;
                Object object8 = this.e(n3);
                if (object8 != null) {
                    ((lt2_1)object8).b = object7 = ow_0.b(object2);
                }
                object7 = eb_2.e;
                boolean bl4 = false;
                object = null;
                if (object8 != null) {
                    object6 = ((lt2_1)object8).d;
                } else {
                    bl3 = false;
                    object6 = null;
                }
                object7 = (MediaItem)((HashMap)object7).get(object6);
                if (object7 != null) {
                    float f5;
                    object6 = eb_2.c;
                    object2 = object8 != null ? ((lt2_1)object8).d : null;
                    object6 = (sb3_2)((HashMap)object6).get(object2);
                    if (object8 != null) {
                        object = ((lt2_1)object8).b;
                    }
                    if ((object8 = this.j) != null) {
                        ((PlayerView)((Object)object8)).setPlayer((f)object);
                    }
                    if (object6 != null && (object8 = ((sb3_2)object6).b) != null) {
                        n3 = (Integer)object8;
                    } else {
                        n3 = 0;
                        f5 = 0.0f;
                        object8 = null;
                    }
                    this.e = n3;
                    long l2 = object6 != null && (object8 = ((sb3_2)object6).c) != null ? (Long)object8 : 0L;
                    this.d = l2;
                    if (object6 != null) {
                        f5 = ((sb3_2)object6).f;
                    } else {
                        n3 = 1065353216;
                        f5 = 1.0f;
                    }
                    this.g = object8 = Float.valueOf(f5);
                    this.f = object8 = new la_2(this);
                    if (object != null) {
                        object.setMediaItem((MediaItem)object7);
                        object.setPlayWhenReady(false);
                        n3 = this.e;
                        long l3 = this.d;
                        object.seekTo(n3, l3);
                        object8 = this.f;
                        if (object8 != null) {
                            object.addListener((f$c)object8);
                        }
                        object8 = this.g;
                        Intrinsics.checkNotNull(object8);
                        f5 = ((Float)object8).floatValue();
                        object.setVolume(f5);
                        object.prepare();
                    }
                }
            }
        }
        this.q.clear();
    }

    public final void k(ExoPlayer exoPlayer) {
        Float f5;
        float f6;
        if (exoPlayer != null) {
            f6 = exoPlayer.getVolume();
            this.g = f5 = Float.valueOf(f6);
        }
        if (exoPlayer != null) {
            f6 = 0.0f;
            f5 = null;
            exoPlayer.setVolume(0.0f);
        }
    }

    public final void l() {
        ArrayList arrayList;
        ma_2 ma_22 = this;
        ArrayList arrayList2 = this.a;
        int n3 = arrayList2.size();
        int n4 = 0;
        int n7 = 0;
        Object object = null;
        while (true) {
            arrayList = ma_22.q;
            if (n7 >= n3) break;
            arrayList.add(null);
            ++n7;
        }
        n3 = arrayList2.size();
        while (n4 < n3) {
            Object object2;
            Object object3;
            int n8;
            Object object4;
            Object object5;
            float f5;
            object = ma_22.a(n4);
            Object object6 = ma_22.e(n4);
            object6 = object6 != null ? ((lt2_1)object6).d : null;
            if (object != null) {
                f5 = object.getVolume();
                object5 = Float.valueOf(f5);
            } else {
                object5 = null;
                f5 = 0.0f;
            }
            Object object7 = object != null && (object4 = object.getCurrentMediaItem()) != null && (object4 = ((MediaItem)object4).b) != null && (object4 = ((MediaItem$e)object4).a) != null ? (object4 = object4.toString()) : null;
            if (object != null) {
                n8 = object.getCurrentMediaItemIndex();
                object3 = object4 = Integer.valueOf(n8);
            } else {
                object3 = null;
            }
            if (object != null) {
                long l2 = object.getCurrentPosition();
                object2 = object4 = Long.valueOf(l2);
            } else {
                object2 = null;
            }
            n8 = 0;
            object4 = null;
            float f6 = object5 != null ? (f5 = ((Float)object5).floatValue()) : 0.0f;
            if (object != null) {
                f5 = object.getVolume();
                object5 = Float.valueOf(f5);
            } else {
                object5 = null;
                f5 = 0.0f;
            }
            boolean bl2 = Intrinsics.areEqual((Float)object5, 0.0f);
            int n10 = 208;
            object5 = new sb3_2((String)object7, (Integer)object3, (Long)object2, bl2, f6, null, null, n10);
            if (object6 != null) {
                object4 = eb_2.c;
                ((HashMap)object4).put(object6, object5);
            }
            if (object != null && (object = object.getCurrentMediaItem()) != null) {
                arrayList.set(n4, object);
            }
            if ((object = (lt2_1)arrayList2.get(n4)) != null && (object = ((lt2_1)object).b) != null) {
                object.release();
            }
            if ((object = (lt2_1)arrayList2.get(n4)) != null) {
                ((lt2_1)object).b = null;
            }
            ++n4;
        }
    }

    public final void m() {
        ArrayList arrayList;
        int n3;
        ma_2 ma_22 = this;
        Object object = this.u;
        if (object != null) {
            object.u4();
        }
        if ((object = ma_22.t) != null) {
            n3 = -1;
            ((bb3_1)object).f(n3);
        }
        object = ma_22.a;
        n3 = ((ArrayList)object).size();
        int n4 = 0;
        while (true) {
            arrayList = ma_22.q;
            if (n4 >= n3) break;
            arrayList.add(null);
            ++n4;
        }
        n3 = ((ArrayList)object).size();
        for (n4 = 0; n4 < n3; ++n4) {
            boolean bl2;
            sb3_2 sb3_22;
            Object object2;
            Object object3;
            boolean bl3;
            Object object4;
            boolean bl4;
            Object object5;
            float f5;
            boolean bl5;
            Object object6 = ma_22.a(n4);
            Object object7 = ma_22.e(n4);
            if (object7 != null) {
                object7 = ((lt2_1)object7).d;
            } else {
                bl5 = false;
                object7 = null;
            }
            if (object6 != null) {
                f5 = object6.getVolume();
                object5 = Float.valueOf(f5);
            } else {
                bl4 = false;
                object5 = null;
                f5 = 0.0f;
            }
            Object object8 = object6 != null && (object4 = object6.getCurrentMediaItem()) != null && (object4 = ((MediaItem)object4).b) != null && (object4 = ((MediaItem$e)object4).a) != null ? (object4 = object4.toString()) : null;
            if (object6 != null) {
                bl3 = object6.getCurrentMediaItemIndex();
                object3 = object4 = Integer.valueOf((int)(bl3 ? 1 : 0));
            } else {
                object3 = null;
            }
            if (object6 != null) {
                long l2 = object6.getCurrentPosition();
                object2 = object4 = Long.valueOf(l2);
            } else {
                object2 = null;
            }
            bl3 = false;
            object4 = null;
            float f6 = object5 != null ? (f5 = ((Float)object5).floatValue()) : 0.0f;
            if (object6 != null) {
                f5 = object6.getVolume();
                object5 = Float.valueOf(f5);
            } else {
                bl4 = false;
                object5 = null;
                f5 = 0.0f;
            }
            boolean bl6 = Intrinsics.areEqual((Float)object5, 0.0f);
            cp_1.Companion.getClass();
            object5 = cp$a.d();
            if (object5 != null && (object5 = ((KYPSettings)object5).getAudioSettings()) != null && (object5 = ((AudioSettings)object5).getMuteOnFullScreen()) != null) {
                bl4 = (Boolean)object5;
            } else {
                bl4 = false;
                f5 = 0.0f;
                object5 = null;
            }
            object4 = cp$a.d();
            if (object4 != null && (object4 = ((KYPSettings)object4).getAudioSettings()) != null && (object4 = ((AudioSettings)object4).getMuteOnMinimizedScreen()) != null) {
                bl3 = (Boolean)object4;
            } else {
                bl3 = false;
                object4 = null;
            }
            Boolean bl7 = bl4;
            Boolean bl8 = bl3;
            int n7 = 16;
            object5 = sb3_22;
            sb3_22 = new sb3_2((String)object8, (Integer)object3, (Long)object2, bl6, f6, bl7, bl8, n7);
            if (object7 != null) {
                object4 = eb_2.d;
                ((HashMap)object4).put(object7, sb3_22);
            }
            if (object6 != null && (object6 = object6.getCurrentMediaItem()) != null) {
                arrayList.set(n4, object6);
            }
            if ((object6 = (lt2_1)((ArrayList)object).get(n4)) != null && (object6 = ((lt2_1)object6).b) != null && (bl2 = object6.isPlaying()) == (bl5 = true) && (object6 = (lt2_1)((ArrayList)object).get(n4)) != null && (object6 = ((lt2_1)object6).b) != null) {
                object6.pause();
            }
            if ((object6 = (lt2_1)((ArrayList)object).get(n4)) != null && (object6 = ((lt2_1)object6).b) != null) {
                object6.release();
            }
            if ((object6 = (lt2_1)((ArrayList)object).get(n4)) == null) continue;
            ((lt2_1)object6).b = null;
        }
    }

    public final void o(int n3, pb_2 object, ExoPlayer exoPlayer) {
        Object object2;
        Object object3 = this.e(n3);
        if (object3 != null) {
            la_2 la_22 = this.f;
            ((lt2_1)object3).a = la_22;
        }
        if ((object3 = this.e(n3)) != null) {
            ((lt2_1)object3).c = object;
        }
        if ((object = this.e(n3)) != null) {
            ((lt2_1)object).e = object3 = Integer.valueOf(n3);
        }
        if ((object = this.t) != null) {
            ((bb3_1)object).f(n3);
        }
        if ((object2 = this.p) != null) {
            exoPlayer.setMediaItem((MediaItem)object2);
            n3 = 0;
            exoPlayer.setPlayWhenReady(false);
            long l2 = this.d;
            exoPlayer.seekTo(l2);
            object2 = this.f;
            if (object2 != null) {
                exoPlayer.addListener((f$c)object2);
            }
            exoPlayer.prepare();
        }
    }

    public final void q() {
        Object object;
        int n3 = this.r;
        if (n3 < 0) {
            n3 = 0;
            object = null;
        }
        Object object2 = this.a;
        int n4 = ((ArrayList)object2).isEmpty() ^ 1;
        if (n4 != 0) {
            n4 = this.b;
            object = this.a(n3 %= n4);
        } else {
            n3 = 0;
            object = null;
        }
        long l2 = 0L;
        long l3 = object != null ? object.getDuration() : l2;
        long l4 = object != null ? object.getCurrentPosition() : l2;
        l3 -= l4;
        object = TimeUnit.SECONDS;
        l4 = ((TimeUnit)((Object)object)).toMillis(1L);
        n3 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
        if (n3 > 0) {
            object = this.n;
            object2 = this.i;
            Object object3 = (Runnable)((hh3_2)object2).getValue();
            object.removeCallbacks((Runnable)object3);
            object3 = this.m;
            Long l7 = l3;
            ((LiveData)object3).k(l7);
            object2 = (Runnable)((hh3_2)object2).getValue();
            object.postDelayed((Runnable)object2, l4);
        }
    }

    public final void r() {
        long l2;
        Object object;
        int n3 = this.r;
        if (n3 < 0) {
            n3 = 0;
            object = null;
        }
        Object object2 = this.a;
        boolean n4 = ((ArrayList)object2).isEmpty();
        int n7 = 1;
        boolean bl2 = n4 ^ n7;
        if (bl2) {
            int n8 = this.b;
            object = this.a(n3 %= n8);
        } else {
            n3 = 0;
            object = null;
        }
        long l3 = 0L;
        long l4 = object != null ? object.getDuration() : l3;
        long l7 = object != null ? object.getCurrentPosition() : l3;
        long l8 = l7 == l3 ? 0 : (l7 < l3 ? -1 : 1);
        if (l8 > 0) {
            object2 = this.l;
            Long l12 = l7;
            ((LiveData)object2).k(l12);
        }
        if ((l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) > 0) {
            int n10;
            object2 = this.k;
            l3 = 100;
            l7 = l7 * l3 / l4;
            int n14 = (int)l7;
            Serializable serializable = Integer.valueOf(n14);
            ((LiveData)object2).k(serializable);
            object2 = this.o;
            serializable = this.h;
            Runnable runnable2 = (Runnable)((hh3_2)serializable).getValue();
            object2.removeCallbacks(runnable2);
            int n15 = object != null ? object.getPlaybackState() : 1;
            if (n15 != n7 && n15 != (n10 = 4)) {
                long l14 = object != null && (n3 = (int)(object.getPlayWhenReady() ? 1 : 0)) == n7 && n15 == (n3 = 3) ? 300L : 1000L;
                object = (Runnable)((hh3_2)serializable).getValue();
                object2.postDelayed((Runnable)object, l14);
            }
        }
    }
}

