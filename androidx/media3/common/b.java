/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.MediaItem;
import androidx.media3.common.f;
import androidx.media3.common.g;
import androidx.media3.common.g$c;
import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class b
implements f {
    public final g$c a;

    public b() {
        g$c g$c;
        this.a = g$c = new g$c();
    }

    public final void a(int n3) {
        this.b(-1, n3, -9223372036854775807L, false);
    }

    public final void addMediaItem(int n3, MediaItem object) {
        object = ImmutableList.of(object);
        this.addMediaItems(n3, (List)object);
    }

    public final void addMediaItem(MediaItem object) {
        object = ImmutableList.of(object);
        this.addMediaItems((List)object);
    }

    public final void addMediaItems(List list) {
        this.addMediaItems(-1 >>> 1, list);
    }

    public abstract void b(int var1, int var2, long var3, boolean var5);

    public final void c(int n3, long l2) {
        int n4 = this.getCurrentMediaItemIndex();
        this.b(n4, n3, l2, false);
    }

    public final boolean canAdvertiseSession() {
        return true;
    }

    public final void clearMediaItems() {
        this.removeMediaItems(0, -1 >>> 1);
    }

    public final void d(int n3) {
        int n4;
        int n7 = this.getPreviousMediaItemIndex();
        if (n7 == (n4 = -1)) {
            this.a(n3);
            return;
        }
        n4 = this.getCurrentMediaItemIndex();
        if (n7 == n4) {
            int n8 = this.getCurrentMediaItemIndex();
            long l2 = -9223372036854775807L;
            boolean bl2 = true;
            this.b(n8, n3, l2, bl2);
        } else {
            long l3 = -9223372036854775807L;
            this.b(n7, n3, l3, false);
        }
    }

    public final int getBufferedPercentage() {
        long l2 = this.getBufferedPosition();
        long l3 = this.getDuration();
        int n3 = 0;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false && (object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) != false) {
            l4 = 0L;
            object = 100;
            Object object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object2 == false) {
                n3 = 100;
            } else {
                l4 = 100;
                l2 = l2 * l4 / l3;
                int n4 = (int)l2;
                n3 = gz3.h(n4, 0, (int)object);
            }
        }
        return n3;
    }

    public final long getContentDuration() {
        long l2;
        Object object = this.getCurrentTimeline();
        boolean n3 = ((g)object).q();
        if (n3) {
            l2 = -9223372036854775807L;
        } else {
            int n4 = this.getCurrentMediaItemIndex();
            long l3 = 0L;
            g$c g$c = this.a;
            object = ((g)object).n(n4, g$c, l3);
            l2 = gz3.T(((g$c)object).m);
        }
        return l2;
    }

    public final long getCurrentLiveOffset() {
        Object object = this.getCurrentTimeline();
        boolean n3 = ((g)object).q();
        long l2 = -9223372036854775807L;
        if (n3) {
            return l2;
        }
        int n4 = this.getCurrentMediaItemIndex();
        long l3 = 0L;
        g$c g$c = this.a;
        object = ((g)object).n(n4, g$c, l3);
        long l4 = ((g$c)object).f;
        long l7 = l4 - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == false) {
            return l2;
        }
        l4 = g$c.a();
        l2 = g$c.f;
        l4 -= l2;
        l2 = this.getContentPosition();
        return l4 - l2;
    }

    public final Object getCurrentManifest() {
        Object object = this.getCurrentTimeline();
        boolean n3 = ((g)object).q();
        if (n3) {
            object = null;
        } else {
            int n4 = this.getCurrentMediaItemIndex();
            long l2 = 0L;
            g$c g$c = this.a;
            object = ((g)object).n((int)n4, (g$c)g$c, (long)l2).d;
        }
        return object;
    }

    public final MediaItem getCurrentMediaItem() {
        Object object = this.getCurrentTimeline();
        boolean n3 = ((g)object).q();
        if (n3) {
            object = null;
        } else {
            int n4 = this.getCurrentMediaItemIndex();
            long l2 = 0L;
            g$c g$c = this.a;
            object = ((g)object).n((int)n4, (g$c)g$c, (long)l2).c;
        }
        return object;
    }

    public final int getCurrentWindowIndex() {
        return this.getCurrentMediaItemIndex();
    }

    public final MediaItem getMediaItemAt(int n3) {
        g g3 = this.getCurrentTimeline();
        g$c g$c = this.a;
        return g3.n((int)n3, (g$c)g$c, (long)0L).c;
    }

    public final int getMediaItemCount() {
        return this.getCurrentTimeline().p();
    }

    public final int getNextMediaItemIndex() {
        int n3;
        g g3 = this.getCurrentTimeline();
        int n4 = g3.q();
        if (n4 != 0) {
            n3 = -1;
        } else {
            int n7;
            n4 = this.getCurrentMediaItemIndex();
            int n8 = this.getRepeatMode();
            if (n8 == (n7 = 1)) {
                n8 = 0;
            }
            n7 = (int)(this.getShuffleModeEnabled() ? 1 : 0);
            n3 = g3.e(n4, n8, n7 != 0);
        }
        return n3;
    }

    public final int getNextWindowIndex() {
        return this.getNextMediaItemIndex();
    }

    public final int getPreviousMediaItemIndex() {
        int n3;
        g g3 = this.getCurrentTimeline();
        int n4 = g3.q();
        if (n4 != 0) {
            n3 = -1;
        } else {
            int n7;
            n4 = this.getCurrentMediaItemIndex();
            int n8 = this.getRepeatMode();
            if (n8 == (n7 = 1)) {
                n8 = 0;
            }
            n7 = (int)(this.getShuffleModeEnabled() ? 1 : 0);
            n3 = g3.l(n4, n8, n7 != 0);
        }
        return n3;
    }

    public final int getPreviousWindowIndex() {
        return this.getPreviousMediaItemIndex();
    }

    public final boolean hasNext() {
        return this.hasNextMediaItem();
    }

    public final boolean hasNextMediaItem() {
        int n3;
        int n4 = this.getNextMediaItemIndex();
        n4 = n4 != (n3 = -1) ? 1 : 0;
        return n4 != 0;
    }

    public final boolean hasNextWindow() {
        return this.hasNextMediaItem();
    }

    public final boolean hasPreviousMediaItem() {
        int n3;
        int n4 = this.getPreviousMediaItemIndex();
        n4 = n4 != (n3 = -1) ? 1 : 0;
        return n4 != 0;
    }

    public final boolean isCommandAvailable(int n3) {
        return this.getAvailableCommands().a.a.get(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isCurrentMediaItemDynamic() {
        Object object = this.getCurrentTimeline();
        int n3 = ((g)object).q();
        if (n3 != 0) return false;
        n3 = this.getCurrentMediaItemIndex();
        long l2 = 0L;
        g$c g$c = this.a;
        object = ((g)object).n(n3, g$c, l2);
        boolean bl2 = ((g$c)object).i;
        if (!bl2) return false;
        return true;
    }

    public final boolean isCurrentMediaItemLive() {
        long l2;
        g$c g$c;
        int n3;
        boolean bl2;
        Object object = this.getCurrentTimeline();
        boolean n32 = ((g)object).q();
        if (!n32 && (bl2 = ((g$c)(object = ((g)object).n(n3 = this.getCurrentMediaItemIndex(), g$c = this.a, l2 = 0L))).b())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isCurrentMediaItemSeekable() {
        Object object = this.getCurrentTimeline();
        int n3 = ((g)object).q();
        if (n3 != 0) return false;
        n3 = this.getCurrentMediaItemIndex();
        long l2 = 0L;
        g$c g$c = this.a;
        object = ((g)object).n(n3, g$c, l2);
        boolean bl2 = ((g$c)object).h;
        if (!bl2) return false;
        return true;
    }

    public final boolean isCurrentWindowDynamic() {
        return this.isCurrentMediaItemDynamic();
    }

    public final boolean isCurrentWindowLive() {
        return this.isCurrentMediaItemLive();
    }

    public final boolean isCurrentWindowSeekable() {
        return this.isCurrentMediaItemSeekable();
    }

    public final boolean isPlaying() {
        int n3;
        int n4 = this.getPlaybackState();
        n4 = n4 == (n3 = 3) && (n4 = (int)(this.getPlayWhenReady() ? 1 : 0)) != 0 && (n4 = this.getPlaybackSuppressionReason()) == 0 ? 1 : 0;
        return n4 != 0;
    }

    public final void moveMediaItem(int n3, int n4) {
        if (n3 != n4) {
            int n7 = n3 + 1;
            this.moveMediaItems(n3, n7, n4);
        }
    }

    public final void next() {
        this.seekToNextMediaItem();
    }

    public final void pause() {
        this.setPlayWhenReady(false);
    }

    public final void play() {
        this.setPlayWhenReady(true);
    }

    public final void removeMediaItem(int n3) {
        int n4 = n3 + 1;
        this.removeMediaItems(n3, n4);
    }

    public final void replaceMediaItem(int n3, MediaItem object) {
        int n4 = n3 + 1;
        object = ImmutableList.of(object);
        this.replaceMediaItems(n3, n4, (List)object);
    }

    public final void seekBack() {
        long l2;
        long l3 = -this.getSeekBackIncrement();
        long l4 = this.getCurrentPosition() + l3;
        l3 = this.getDuration();
        long l7 = l3 - (l2 = -9223372036854775807L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            l4 = Math.min(l4, l3);
        }
        l3 = Math.max(l4, 0L);
        this.c(11, l3);
    }

    public final void seekForward() {
        long l2;
        long l3 = this.getSeekForwardIncrement();
        long l4 = this.getCurrentPosition() + l3;
        l3 = this.getDuration();
        long l7 = l3 - (l2 = -9223372036854775807L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object != false) {
            l4 = Math.min(l4, l3);
        }
        l3 = Math.max(l4, 0L);
        this.c(12, l3);
    }

    public final void seekTo(int n3, long l2) {
        this.b(n3, 10, l2, false);
    }

    public final void seekTo(long l2) {
        this.c(5, l2);
    }

    public final void seekToDefaultPosition() {
        int n3 = this.getCurrentMediaItemIndex();
        this.b(n3, 4, -9223372036854775807L, false);
    }

    public final void seekToDefaultPosition(int n3) {
        this.b(n3, 10, -9223372036854775807L, false);
    }

    public final void seekToNext() {
        g g3 = this.getCurrentTimeline();
        int n3 = g3.q();
        int n4 = 9;
        if (n3 == 0 && (n3 = this.isPlayingAd()) == 0) {
            n3 = this.hasNextMediaItem();
            if (n3 != 0) {
                int n7 = this.getNextMediaItemIndex();
                if (n7 == (n3 = -1)) {
                    this.a(n4);
                } else {
                    n3 = this.getCurrentMediaItemIndex();
                    if (n7 == n3) {
                        n7 = this.getCurrentMediaItemIndex();
                        long l2 = -9223372036854775807L;
                        boolean bl2 = true;
                        this.b(n7, n4, l2, bl2);
                    } else {
                        long l3 = -9223372036854775807L;
                        boolean bl3 = false;
                        this.b(n7, n4, l3, false);
                    }
                }
            } else {
                n3 = this.isCurrentMediaItemLive();
                if (n3 != 0 && (n3 = (int)(this.isCurrentMediaItemDynamic() ? 1 : 0)) != 0) {
                    int n8 = this.getCurrentMediaItemIndex();
                    long l4 = -9223372036854775807L;
                    boolean bl4 = false;
                    this.b(n8, n4, l4, false);
                } else {
                    this.a(n4);
                }
            }
            return;
        }
        this.a(n4);
    }

    public final void seekToNextMediaItem() {
        int n3 = this.getNextMediaItemIndex();
        int n4 = -1;
        int n7 = 8;
        if (n3 == n4) {
            this.a(n7);
        } else {
            n4 = this.getCurrentMediaItemIndex();
            if (n3 == n4) {
                int n8 = this.getCurrentMediaItemIndex();
                long l2 = -9223372036854775807L;
                boolean bl2 = true;
                this.b(n8, n7, l2, bl2);
            } else {
                long l3 = -9223372036854775807L;
                boolean bl3 = false;
                this.b(n3, n7, l3, false);
            }
        }
    }

    public final void seekToNextWindow() {
        this.seekToNextMediaItem();
    }

    public final void seekToPrevious() {
        g g3 = this.getCurrentTimeline();
        int n3 = g3.q();
        int n4 = 7;
        if (n3 == 0 && (n3 = this.isPlayingAd()) == 0) {
            long l2;
            long l3;
            long l4;
            n3 = this.hasPreviousMediaItem();
            boolean bl2 = this.isCurrentMediaItemLive();
            if (bl2 && !(bl2 = this.isCurrentMediaItemSeekable())) {
                if (n3 != 0) {
                    this.d(n4);
                } else {
                    this.a(n4);
                }
            } else if (n3 != 0 && (n3 = (l4 = (l3 = this.getCurrentPosition()) - (l2 = this.getMaxSeekToPreviousPosition())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                this.d(n4);
            } else {
                l3 = 0L;
                this.c(n4, l3);
            }
            return;
        }
        this.a(n4);
    }

    public final void seekToPreviousMediaItem() {
        this.d(6);
    }

    public final void seekToPreviousWindow() {
        this.seekToPreviousMediaItem();
    }

    public final void setMediaItem(MediaItem object) {
        object = ImmutableList.of(object);
        this.setMediaItems((List)object, true);
    }

    public final void setMediaItem(MediaItem object, long l2) {
        object = ImmutableList.of(object);
        this.setMediaItems((List)object, 0, l2);
    }

    public final void setMediaItem(MediaItem object, boolean bl2) {
        object = ImmutableList.of(object);
        this.setMediaItems((List)object, bl2);
    }

    public final void setMediaItems(List list) {
        this.setMediaItems(list, true);
    }

    public final void setPlaybackSpeed(float f5) {
        ot2_0 ot2_02 = this.getPlaybackParameters();
        float f6 = ot2_02.b;
        ot2_0 ot2_03 = new ot2_0(f5, f6);
        this.setPlaybackParameters(ot2_03);
    }
}

