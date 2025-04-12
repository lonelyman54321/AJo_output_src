/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.opengl.GLSurfaceView
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.AttributeSet
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.SurfaceView
 *  android.view.TextureView
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView
 *  android.window.SurfaceSyncGroup
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.f;
import androidx.media3.common.f$c;
import androidx.media3.common.g;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.AspectRatioFrameLayout$a;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerControlView$c;
import androidx.media3.ui.PlayerControlView$l;
import androidx.media3.ui.PlayerView$a;
import androidx.media3.ui.PlayerView$b;
import androidx.media3.ui.PlayerView$c;
import androidx.media3.ui.PlayerView$d;
import androidx.media3.ui.R$color;
import androidx.media3.ui.R$drawable;
import androidx.media3.ui.R$id;
import androidx.media3.ui.R$layout;
import androidx.media3.ui.R$string;
import androidx.media3.ui.R$styleable;
import androidx.media3.ui.SubtitleView;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayerView
extends FrameLayout {
    public static final int ARTWORK_DISPLAY_MODE_FILL = 2;
    public static final int ARTWORK_DISPLAY_MODE_FIT = 1;
    public static final int ARTWORK_DISPLAY_MODE_OFF = 0;
    public static final int IMAGE_DISPLAY_MODE_FILL = 1;
    public static final int IMAGE_DISPLAY_MODE_FIT = 0;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final FrameLayout adOverlayFrameLayout;
    private int artworkDisplayMode;
    private final ImageView artworkView;
    private final View bufferingView;
    private final PlayerView$a componentListener;
    private final AspectRatioFrameLayout contentFrame;
    private final PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private PlayerView$b controllerVisibilityListener;
    private CharSequence customErrorMessage;
    private Drawable defaultArtwork;
    private boolean enableComposeSurfaceSyncWorkaround;
    private bB0 errorMessageProvider;
    private final TextView errorMessageView;
    private final Class exoPlayerClazz;
    private PlayerView$c fullscreenButtonClickListener;
    private int imageDisplayMode;
    private final Object imageOutput;
    private final ImageView imageView;
    private boolean keepContentOnPlayerReset;
    private PlayerControlView$l legacyControllerVisibilityListener;
    private final Handler mainLooperHandler;
    private final FrameLayout overlayFrameLayout;
    private f player;
    private final Method setImageOutputMethod;
    private int showBuffering;
    private final View shutterView;
    private final SubtitleView subtitleView;
    private final PlayerView$d surfaceSyncGroupV34;
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private boolean useController;

    public PlayerView(Context context) {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PlayerView(Context context, AttributeSet attributeSet, int n3) {
        int n4;
        TextView textView;
        View view;
        SubtitleView subtitleView;
        ImageView imageView;
        void var9_19;
        void var15_56;
        ImageView imageView2;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        void var15_50;
        Class<VideoDecoderGLSurfaceView> clazz;
        Class[] classArray;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        Looper looper;
        Object object;
        int n22;
        Object object2;
        Object object3;
        PlayerView playerView;
        block43: {
            block41: {
                AspectRatioFrameLayout aspectRatioFrameLayout;
                ViewGroup.LayoutParams layoutParams;
                int n24;
                block40: {
                    block42: {
                        View view2;
                        int n25;
                        int n26;
                        Handler handler;
                        playerView = this;
                        object3 = context;
                        object2 = attributeSet;
                        n22 = 1;
                        super(context, attributeSet, n3);
                        object = new PlayerView$a(this);
                        this.componentListener = object;
                        looper = Looper.getMainLooper();
                        this.mainLooperHandler = handler = new Handler(looper);
                        n21 = this.isInEditMode();
                        n20 = 0;
                        looper = null;
                        n19 = 0;
                        if (n21 != 0) {
                            this.contentFrame = null;
                            this.shutterView = null;
                            this.surfaceView = null;
                            this.surfaceViewIgnoresVideoAspectRatio = false;
                            this.surfaceSyncGroupV34 = null;
                            this.imageView = null;
                            this.artworkView = null;
                            this.subtitleView = null;
                            this.bufferingView = null;
                            this.errorMessageView = null;
                            this.controller = null;
                            this.adOverlayFrameLayout = null;
                            this.overlayFrameLayout = null;
                            this.exoPlayerClazz = null;
                            this.setImageOutputMethod = null;
                            this.imageOutput = null;
                            super(context);
                            n22 = gz3.a;
                            int n27 = 23;
                            if (n22 >= n27) {
                                Resources resources = this.getResources();
                                PlayerView.configureEditModeLogoV23(context, resources, (ImageView)object2);
                            } else {
                                Resources resources = this.getResources();
                                PlayerView.configureEditModeLogo(context, resources, (ImageView)object2);
                            }
                            playerView.addView((View)object2);
                            return;
                        }
                        n21 = R$layout.exo_player_view;
                        if (attributeSet != null) {
                            Resources.Theme theme = context.getTheme();
                            int[] nArray = R$styleable.PlayerView;
                            n18 = n3;
                            theme = theme.obtainStyledAttributes(attributeSet, nArray, n3, 0);
                            try {
                                n17 = R$styleable.PlayerView_shutter_background_color;
                                n17 = (int)(theme.hasValue(n17) ? 1 : 0);
                                n18 = R$styleable.PlayerView_shutter_background_color;
                                n18 = theme.getColor(n18, 0);
                                n26 = R$styleable.PlayerView_player_layout_id;
                                n21 = theme.getResourceId(n26, n21);
                                n26 = R$styleable.PlayerView_use_artwork;
                                n26 = (int)(theme.getBoolean(n26, n22 != 0) ? 1 : 0);
                                n25 = R$styleable.PlayerView_artwork_display_mode;
                                n25 = theme.getInt(n25, n22);
                                n16 = R$styleable.PlayerView_default_artwork;
                                n16 = theme.getResourceId(n16, 0);
                                n15 = R$styleable.PlayerView_image_display_mode;
                                n15 = theme.getInt(n15, 0);
                                n19 = R$styleable.PlayerView_use_controller;
                                n19 = (int)(theme.getBoolean(n19, n22 != 0) ? 1 : 0);
                                n24 = R$styleable.PlayerView_surface_type;
                                n24 = theme.getInt(n24, n22);
                                n22 = R$styleable.PlayerView_resize_mode;
                                n22 = theme.getInt(n22, 0);
                                n20 = R$styleable.PlayerView_show_timeout;
                                n3 = n22;
                                n22 = 5000;
                                n22 = theme.getInt(n20, n22);
                                n20 = R$styleable.PlayerView_hide_on_touch;
                                n14 = n22;
                                n22 = 1;
                                n20 = (int)(theme.getBoolean(n20, n22 != 0) ? 1 : 0);
                                n10 = n21;
                                n21 = R$styleable.PlayerView_auto_show;
                                n21 = (int)(theme.getBoolean(n21, n22 != 0) ? 1 : 0);
                                n22 = R$styleable.PlayerView_show_buffering;
                                n8 = n21;
                                n21 = 0;
                                Object var9_13 = null;
                                n22 = theme.getInteger(n22, 0);
                                n21 = R$styleable.PlayerView_keep_content_on_player_reset;
                                int n28 = n22;
                                n22 = (int)(this.keepContentOnPlayerReset ? 1 : 0);
                                this.keepContentOnPlayerReset = n22 = theme.getBoolean(n21, n22 != 0);
                                n22 = R$styleable.PlayerView_hide_during_ads;
                                n21 = 1;
                                n22 = (int)(theme.getBoolean(n22, n21 != 0) ? 1 : 0);
                                n7 = n28;
                                int n29 = n22;
                                n22 = n3;
                                n3 = n19;
                                n19 = n15;
                                n15 = n25;
                                n25 = n18;
                                n18 = n24;
                                n24 = n10;
                                n10 = n29;
                                int n30 = n26;
                                n26 = n17;
                                n17 = n16;
                                n16 = n30;
                            }
                            finally {
                                theme.recycle();
                            }
                        } else {
                            n24 = n21;
                            n3 = 1;
                            n22 = 0;
                            Object var15_32 = null;
                            n20 = 1;
                            n19 = 0;
                            n7 = 0;
                            Object var16_66 = null;
                            n17 = 0;
                            Object var17_68 = null;
                            n18 = 1;
                            n26 = 0;
                            classArray = null;
                            n25 = 0;
                            layoutParams = null;
                            n16 = 1;
                            n15 = 1;
                            n14 = 5000;
                            n10 = 1;
                            n8 = 1;
                        }
                        LayoutInflater.from((Context)context).inflate(n24, (ViewGroup)playerView);
                        playerView.setDescendantFocusability(262144);
                        n21 = R$id.exo_content_frame;
                        playerView.contentFrame = aspectRatioFrameLayout = (AspectRatioFrameLayout)playerView.findViewById(n21);
                        if (aspectRatioFrameLayout != null) {
                            PlayerView.setResizeModeRaw(aspectRatioFrameLayout, n22);
                        }
                        n22 = R$id.exo_shutter;
                        playerView.shutterView = view2 = playerView.findViewById(n22);
                        if (view2 != null && n26 != 0) {
                            view2.setBackgroundColor(n25);
                        }
                        n24 = 3;
                        n26 = 2;
                        if (aspectRatioFrameLayout == null || n18 == 0) break block41;
                        n22 = -1;
                        layoutParams = new ViewGroup.LayoutParams(n22, n22);
                        if (n18 == n26) break block42;
                        Class<Context> clazz2 = Context.class;
                        if (n18 != n24) {
                            n26 = 4;
                            if (n18 != n26) {
                                SurfaceView surfaceView = new SurfaceView((Context)object3);
                                n18 = gz3.a;
                                n26 = 34;
                                if (n18 >= n26) {
                                    qu2_0.b(surfaceView);
                                }
                                playerView.surfaceView = surfaceView;
                                break block40;
                            } else {
                                clazz = VideoDecoderGLSurfaceView.class;
                                try {
                                    View view3;
                                    n26 = VideoDecoderGLSurfaceView.b;
                                    n26 = 1;
                                    Class[] classArray2 = new Class[n26];
                                    classArray2[0] = clazz2;
                                    Constructor constructor = clazz.getConstructor(classArray2);
                                    Object[] objectArray = new Object[n26];
                                    objectArray[0] = object3;
                                    Object t3 = constructor.newInstance(objectArray);
                                    playerView.surfaceView = view3 = (View)t3;
                                }
                                catch (Exception exception) {
                                    super("video_decoder_gl_surface_view requires an ExoPlayer dependency", exception);
                                    throw object2;
                                }
                            }
                        } else {
                            Class<SphericalGLSurfaceView> clazz3 = SphericalGLSurfaceView.class;
                            try {
                                View view4;
                                n18 = SphericalGLSurfaceView.l;
                                n18 = 1;
                                classArray = new Class[n18];
                                classArray[0] = clazz2;
                                Constructor constructor = clazz3.getConstructor(classArray);
                                Object[] objectArray = new Object[n18];
                                objectArray[0] = object3;
                                Object t4 = constructor.newInstance(objectArray);
                                playerView.surfaceView = view4 = (View)t4;
                                n22 = 1;
                            }
                            catch (Exception exception) {
                                super("spherical_gl_surface_view requires an ExoPlayer dependency", exception);
                                throw object2;
                            }
                        }
                    }
                    TextureView textureView = new TextureView((Context)object3);
                    playerView.surfaceView = textureView;
                }
                n22 = 0;
                Object var15_44 = null;
                playerView.surfaceView.setLayoutParams(layoutParams);
                playerView.surfaceView.setOnClickListener((View.OnClickListener)object);
                object = playerView.surfaceView;
                n24 = 0;
                Object var35_91 = null;
                object.setClickable(false);
                object = playerView.surfaceView;
                aspectRatioFrameLayout.addView((View)object, 0);
                break block43;
            }
            playerView.surfaceView = null;
            n22 = 0;
            Object var15_46 = null;
        }
        playerView.surfaceViewIgnoresVideoAspectRatio = n22;
        n22 = gz3.a;
        int n32 = 34;
        if (n22 == n32) {
            PlayerView$d playerView$d;
            super();
        } else {
            n22 = 0;
            Object var15_49 = null;
        }
        playerView.surfaceSyncGroupV34 = var15_50;
        n22 = R$id.exo_ad_overlay;
        playerView.adOverlayFrameLayout = frameLayout2 = (FrameLayout)playerView.findViewById(n22);
        n22 = R$id.exo_overlay;
        playerView.overlayFrameLayout = frameLayout = (FrameLayout)playerView.findViewById(n22);
        n22 = R$id.exo_image;
        playerView.imageView = imageView2 = (ImageView)playerView.findViewById(n22);
        playerView.imageDisplayMode = n19;
        Class<ExoPlayer> clazz4 = ExoPlayer.class;
        object = ImageOutput.class;
        String string2 = "setImageOutput";
        n19 = 1;
        try {
            Class[] classArray3 = new Class[n19];
            n18 = 0;
            clazz = null;
            classArray3[0] = object;
            Method method = clazz4.getMethod(string2, classArray3);
            ClassLoader classLoader = ((Class)object).getClassLoader();
            classArray = new Class[n19];
            classArray[0] = object;
            object = new ou2(playerView);
            object = Proxy.newProxyInstance(classLoader, classArray, (InvocationHandler)object);
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            n22 = 0;
            Object var15_55 = null;
            n32 = 0;
            object = null;
            n21 = 0;
            Object var9_18 = null;
        }
        playerView.exoPlayerClazz = var15_56;
        playerView.setImageOutputMethod = var9_19;
        playerView.imageOutput = object;
        n22 = R$id.exo_artwork;
        playerView.artworkView = imageView = (ImageView)playerView.findViewById(n22);
        if (n16 != 0 && n15 != 0 && imageView != null) {
            n21 = n15;
        } else {
            n21 = 0;
            Object var9_20 = null;
        }
        playerView.artworkDisplayMode = n21;
        if (n17 != 0) {
            Drawable drawable2;
            playerView.defaultArtwork = drawable2 = t70.getDrawable(this.getContext(), n17);
        }
        n22 = R$id.exo_subtitles;
        playerView.subtitleView = subtitleView = (SubtitleView)playerView.findViewById(n22);
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        n22 = R$id.exo_buffering;
        playerView.bufferingView = view = playerView.findViewById(n22);
        n32 = 8;
        if (view != null) {
            view.setVisibility(n32);
        }
        playerView.showBuffering = n7;
        n22 = R$id.exo_error_message;
        playerView.errorMessageView = textView = (TextView)playerView.findViewById(n22);
        if (textView != null) {
            textView.setVisibility(n32);
        }
        n22 = R$id.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView)playerView.findViewById(n22);
        n32 = R$id.exo_controller_placeholder;
        object = playerView.findViewById(n32);
        if (playerControlView != null) {
            playerView.controller = playerControlView;
            n21 = 0;
            Object var9_21 = null;
        } else if (object != null) {
            PlayerControlView playerControlView2;
            n21 = 0;
            Object var9_22 = null;
            n19 = 0;
            playerView.controller = playerControlView2 = new PlayerControlView((Context)object3, null, 0, (AttributeSet)object2);
            int n34 = R$id.exo_controller;
            playerControlView2.setId(n34);
            object3 = object.getLayoutParams();
            playerControlView2.setLayoutParams((ViewGroup.LayoutParams)object3);
            object3 = (ViewGroup)object.getParent();
            n4 = object3.indexOfChild((View)object);
            object3.removeView((View)object);
            object3.addView((View)playerControlView2, n4);
        } else {
            boolean bl2 = false;
            object3 = null;
            n21 = 0;
            Object var9_23 = null;
            playerView.controller = null;
        }
        object3 = playerView.controller;
        if (object3 != null) {
            n4 = n14;
        } else {
            n4 = 0;
            object2 = null;
        }
        playerView.controllerShowTimeoutMs = n4;
        playerView.controllerHideOnTouch = n20;
        n4 = n8;
        playerView.controllerAutoShow = n8;
        n22 = n10;
        playerView.controllerHideDuringAds = n10;
        if (n3 != 0 && object3 != null) {
            n20 = 1;
        } else {
            n20 = 0;
            looper = null;
        }
        playerView.useController = n20;
        if (object3 != null) {
            object3 = ((PlayerControlView)((Object)object3)).a;
            n4 = ((mu2)object3).z;
            n22 = 3;
            if (n4 != n22 && n4 != (n22 = 2)) {
                ((mu2)object3).f();
                ((mu2)object3).i(n22);
            }
            object3 = playerView.controller;
            object2 = playerView.componentListener;
            object3.getClass();
            object2.getClass();
            object3 = ((PlayerControlView)((Object)object3)).d;
            ((CopyOnWriteArrayList)object3).add(object2);
        }
        if (n3 != 0) {
            boolean bl3 = true;
            playerView.setClickable(bl3);
        }
        this.updateContentDescription();
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.lambda$onImageAvailable$1(bitmap);
    }

    public static /* synthetic */ SubtitleView access$100(PlayerView playerView) {
        return playerView.subtitleView;
    }

    public static /* synthetic */ void access$1000(PlayerView playerView) {
        playerView.hideImage();
    }

    public static /* synthetic */ void access$1100(PlayerView playerView) {
        playerView.hideAndClearImage();
    }

    public static /* synthetic */ void access$1200(PlayerView playerView, boolean bl2) {
        playerView.updateForCurrentTrackSelections(bl2);
    }

    public static /* synthetic */ void access$1300(PlayerView playerView) {
        playerView.updateBuffering();
    }

    public static /* synthetic */ void access$1400(PlayerView playerView) {
        playerView.updateErrorMessage();
    }

    public static /* synthetic */ void access$1500(PlayerView playerView) {
        playerView.updateControllerVisibility();
    }

    public static /* synthetic */ boolean access$1600(PlayerView playerView) {
        return playerView.isPlayingAd();
    }

    public static /* synthetic */ boolean access$1700(PlayerView playerView) {
        return playerView.controllerHideDuringAds;
    }

    public static /* synthetic */ void access$1800(PlayerView playerView) {
        playerView.toggleControllerVisibility();
    }

    public static /* synthetic */ void access$1900(PlayerView playerView) {
        playerView.updateContentDescription();
    }

    public static /* synthetic */ f access$200(PlayerView playerView) {
        return playerView.player;
    }

    public static /* synthetic */ PlayerView$b access$2000(PlayerView playerView) {
        return playerView.controllerVisibilityListener;
    }

    public static /* synthetic */ PlayerView$c access$2100(PlayerView playerView) {
        ((Object)((Object)playerView)).getClass();
        return null;
    }

    public static /* synthetic */ void access$300(PlayerView playerView) {
        playerView.updateAspectRatio();
    }

    public static /* synthetic */ View access$400(PlayerView playerView) {
        return playerView.surfaceView;
    }

    public static /* synthetic */ boolean access$500(PlayerView playerView) {
        return playerView.enableComposeSurfaceSyncWorkaround;
    }

    public static /* synthetic */ Handler access$600(PlayerView playerView) {
        return playerView.mainLooperHandler;
    }

    public static /* synthetic */ PlayerView$d access$700(PlayerView playerView) {
        return playerView.surfaceSyncGroupV34;
    }

    public static /* synthetic */ View access$800(PlayerView playerView) {
        return playerView.shutterView;
    }

    public static /* synthetic */ boolean access$900(PlayerView playerView) {
        return playerView.hasSelectedImageTrack();
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object object, Method method, Object[] objectArray) {
        return playerView.lambda$new$0(object, method, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private void clearImageOutput(f f5) {
        block8: {
            Object[] objectArray;
            boolean bl2;
            Object object = this.exoPlayerClazz;
            if (object != null && (bl2 = ((Class)object).isAssignableFrom((Class<?>)(objectArray = f5.getClass())))) {
                void var1_4;
                object = this.setImageOutputMethod;
                object.getClass();
                int n3 = 1;
                objectArray = new Object[n3];
                objectArray[0] = null;
                try {
                    ((Method)object).invoke((Object)f5, objectArray);
                    break block8;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                object = new RuntimeException((Throwable)var1_4);
                throw object;
            }
        }
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        int n3 = R$drawable.exo_edit_mode_logo;
        context = context.getTheme();
        context = resources.getDrawable(n3, (Resources.Theme)context);
        imageView.setImageDrawable((Drawable)context);
        int n4 = R$color.exo_edit_mode_background_color;
        n4 = resources.getColor(n4);
        imageView.setBackgroundColor(n4);
    }

    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        int n3 = R$drawable.exo_edit_mode_logo;
        context = context.getTheme();
        context = resources.getDrawable(n3, (Resources.Theme)context);
        imageView.setImageDrawable((Drawable)context);
        int n4 = R$color.exo_edit_mode_background_color;
        n4 = M42.a(resources, n4);
        imageView.setBackgroundColor(n4);
    }

    private boolean hasSelectedImageTrack() {
        boolean bl2;
        int n3;
        Object object;
        Object object2 = this.player;
        if (object2 != null && (object = this.imageOutput) != null && (n3 = object2.isCommandAvailable(30)) != 0 && (bl2 = ((bq3)(object2 = object2.getCurrentTracks())).b(n3 = 4))) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        return bl2;
    }

    private boolean hasSelectedVideoTrack() {
        boolean bl2;
        int n3;
        Object object = this.player;
        if (object != null && (n3 = object.isCommandAvailable(30)) != 0 && (bl2 = ((bq3)(object = object.getCurrentTracks())).b(n3 = 2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private void hideAndClearImage() {
        this.hideImage();
        ImageView imageView = this.imageView;
        if (imageView != null) {
            int n3 = 17170445;
            imageView.setImageResource(n3);
        }
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            imageView = this.artworkView;
            int n3 = 4;
            imageView.setVisibility(n3);
        }
    }

    private void hideImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            int n3 = 4;
            imageView.setVisibility(n3);
        }
    }

    private boolean isDpadKey(int n3) {
        int n4 = 19;
        n3 = n3 != n4 && n3 != (n4 = 270) && n3 != (n4 = 22) && n3 != (n4 = 271) && n3 != (n4 = 20) && n3 != (n4 = 269) && n3 != (n4 = 21) && n3 != (n4 = 268) && n3 != (n4 = 23) ? 0 : 1;
        return n3 != 0;
    }

    private boolean isImageSet() {
        int n3;
        ImageView imageView = this.imageView;
        boolean bl2 = false;
        if (imageView == null) {
            return false;
        }
        if ((imageView = imageView.getDrawable()) != null && (n3 = imageView.getAlpha()) != 0) {
            bl2 = true;
        }
        return bl2;
    }

    private boolean isPlayingAd() {
        int n3;
        boolean bl2;
        f f5 = this.player;
        if (f5 != null && (bl2 = f5.isCommandAvailable(n3 = 16)) && (bl2 = (f5 = this.player).isPlayingAd()) && (bl2 = (f5 = this.player).getPlayWhenReady())) {
            bl2 = true;
        } else {
            bl2 = false;
            f5 = null;
        }
        return bl2;
    }

    private /* synthetic */ Object lambda$new$0(Object object, Method object2, Object[] objectArray) {
        object = ((Method)object2).getName();
        int n3 = (int)(((String)object).equals(object2 = "onImageAvailable") ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
            object = (Bitmap)objectArray[n3];
            this.onImageAvailable((Bitmap)object);
        }
        return null;
    }

    private /* synthetic */ void lambda$onImageAvailable$1(Bitmap bitmap) {
        Resources resources = this.getResources();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
        this.setImage((Drawable)bitmapDrawable);
        boolean bl2 = this.hasSelectedVideoTrack();
        if (!bl2) {
            this.showImage();
            this.closeShutter();
        }
    }

    private void maybeShowController(boolean bl2) {
        int n3 = this.isPlayingAd();
        if (n3 != 0 && (n3 = this.controllerHideDuringAds) != 0) {
            return;
        }
        n3 = this.useController();
        if (n3 != 0) {
            PlayerControlView playerControlView = this.controller;
            n3 = playerControlView.g();
            if (n3 != 0 && (n3 = (playerControlView = this.controller).getShowTimeoutMs()) <= 0) {
                n3 = 1;
            } else {
                n3 = 0;
                playerControlView = null;
            }
            boolean bl3 = this.shouldShowControllerIndefinitely();
            if (bl2 || n3 != 0 || bl3) {
                this.showController(bl3);
            }
        }
    }

    private void onImageAvailable(Bitmap bitmap) {
        Handler handler = this.mainLooperHandler;
        pu2 pu22 = new pu2(this, bitmap);
        handler.post((Runnable)pu22);
    }

    private boolean setArtworkFromMediaMetadata(f object) {
        int n3;
        BitmapDrawable bitmapDrawable = null;
        if (object != null && (n3 = object.isCommandAvailable(18)) != 0) {
            object = object.getMediaMetadata().i;
            if (object == null) {
                return false;
            }
            n3 = ((Object)object).length;
            object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
            Resources resources = this.getResources();
            bitmapDrawable = new BitmapDrawable(resources, (Bitmap)object);
            return this.setDrawableArtwork((Drawable)bitmapDrawable);
        }
        return false;
    }

    private boolean setDrawableArtwork(Drawable drawable2) {
        ImageView imageView = this.artworkView;
        if (imageView != null && drawable2 != null) {
            int n3 = drawable2.getIntrinsicWidth();
            int n4 = drawable2.getIntrinsicHeight();
            if (n3 > 0 && n4 > 0) {
                float f5 = n3;
                float f6 = n4;
                f5 /= f6;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                int n7 = this.artworkDisplayMode;
                int n8 = 2;
                if (n7 == n8) {
                    n3 = this.getWidth();
                    f5 = n3;
                    n4 = this.getHeight();
                    f6 = n4;
                    f5 /= f6;
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.contentFrame;
                this.onContentAspectRatioChanged(aspectRatioFrameLayout, f5);
                this.artworkView.setScaleType(scaleType);
                this.artworkView.setImageDrawable(drawable2);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void setImage(Drawable drawable2) {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable2);
        this.updateImageViewAspectRatio();
    }

    /*
     * WARNING - void declaration
     */
    private void setImageOutput(f f5) {
        block9: {
            Object object;
            boolean bl2;
            Object object2 = this.exoPlayerClazz;
            if (object2 != null && (bl2 = ((Class)object2).isAssignableFrom((Class<?>)(object = f5.getClass())))) {
                void var1_4;
                object2 = this.setImageOutputMethod;
                object2.getClass();
                object = this.imageOutput;
                object.getClass();
                int n3 = 1;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                try {
                    ((Method)object2).invoke((Object)f5, objectArray);
                    break block9;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                object2 = new RuntimeException((Throwable)var1_4);
                throw object2;
            }
        }
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int n3) {
        aspectRatioFrameLayout.setResizeMode(n3);
    }

    private boolean shouldShowControllerIndefinitely() {
        int n3;
        block5: {
            block4: {
                int n4;
                Object object;
                f f5 = this.player;
                n3 = 1;
                if (f5 == null) {
                    return n3 != 0;
                }
                int n7 = f5.getPlaybackState();
                int n8 = this.controllerAutoShow;
                if (n8 == 0 || (n8 = (object = this.player).isCommandAvailable(n4 = 17)) != 0 && (n8 = (int)(((g)(object = this.player.getCurrentTimeline())).q() ? 1 : 0)) != 0) break block4;
                if (n7 == n3 || n7 == (n8 = 4)) break block5;
                f5 = this.player;
                f5.getClass();
                n7 = (int)(f5.getPlayWhenReady() ? 1 : 0);
                if (n7 == 0) break block5;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void showController(boolean bl2) {
        void var1_4;
        mu2 mu22;
        boolean bl3 = this.useController();
        if (!bl3) {
            return;
        }
        PlayerControlView playerControlView = this.controller;
        if (bl2) {
            boolean bl4 = false;
            mu22 = null;
        } else {
            int n3 = this.controllerShowTimeoutMs;
        }
        playerControlView.setShowTimeoutMs((int)var1_4);
        mu22 = this.controller.a;
        playerControlView = mu22.a;
        boolean bl5 = playerControlView.h();
        if (!bl5) {
            playerControlView.setVisibility(0);
            playerControlView.i();
            playerControlView = playerControlView.o;
            if (playerControlView != null) {
                playerControlView.requestFocus();
            }
        }
        mu22.k();
    }

    private void showImage() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.updateImageViewAspectRatio();
        }
    }

    public static void switchTargetView(f f5, PlayerView playerView, PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(f5);
        }
        if (playerView != null) {
            f5 = null;
            playerView.setPlayer(null);
        }
    }

    private void toggleControllerVisibility() {
        Object object;
        boolean bl2 = this.useController();
        if (bl2 && (object = this.player) != null) {
            object = this.controller;
            bl2 = ((PlayerControlView)((Object)object)).g();
            if (!bl2) {
                bl2 = true;
                this.maybeShowController(bl2);
            } else {
                bl2 = this.controllerHideOnTouch;
                if (bl2) {
                    object = this.controller;
                    ((PlayerControlView)((Object)object)).f();
                }
            }
        }
    }

    private void updateAspectRatio() {
        float f5;
        Object object = this.player;
        object = object != null ? object.getVideoSize() : wc3_0.d;
        int n3 = ((wc3_0)object).a;
        float f6 = 0.0f;
        int n4 = ((wc3_0)object).b;
        if (n4 != 0 && n3 != 0) {
            f5 = n3;
            float f7 = ((wc3_0)object).c;
            f5 *= f7;
            f7 = n4;
            f5 /= f7;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        object = this.contentFrame;
        n4 = (int)(this.surfaceViewIgnoresVideoAspectRatio ? 1 : 0);
        if (n4 == 0) {
            f6 = f5;
        }
        this.onContentAspectRatioChanged((AspectRatioFrameLayout)((Object)object), f6);
    }

    private void updateBuffering() {
        block4: {
            int n3;
            int n4;
            Object object;
            block6: {
                block5: {
                    int n7;
                    int n8;
                    object = this.bufferingView;
                    if (object == null) break block4;
                    object = this.player;
                    n4 = 0;
                    if (object == null || (n8 = object.getPlaybackState()) != (n7 = 2)) break block5;
                    n8 = this.showBuffering;
                    n3 = 1;
                    if (n8 == n7 || n8 == n3 && (n8 = (int)((object = this.player).getPlayWhenReady() ? 1 : 0)) != 0) break block6;
                }
                n3 = 0;
            }
            object = this.bufferingView;
            if (n3 == 0) {
                n4 = 8;
            }
            object.setVisibility(n4);
        }
    }

    private void updateContentDescription() {
        boolean bl2;
        Object object = this.controller;
        int n3 = 0;
        String string2 = null;
        if (object != null && (bl2 = this.useController)) {
            boolean bl3 = object.g();
            if (bl3) {
                bl3 = this.controllerHideOnTouch;
                if (bl3) {
                    object = this.getResources();
                    n3 = R$string.exo_controls_hide;
                    string2 = object.getString(n3);
                }
                this.setContentDescription(string2);
            } else {
                object = this.getResources();
                n3 = R$string.exo_controls_show;
                object = object.getString(n3);
                this.setContentDescription((CharSequence)object);
            }
        } else {
            this.setContentDescription(null);
        }
    }

    private void updateControllerVisibility() {
        boolean bl2 = this.isPlayingAd();
        if (bl2 && (bl2 = this.controllerHideDuringAds)) {
            this.hideController();
        } else {
            bl2 = false;
            this.maybeShowController(false);
        }
    }

    private void updateErrorMessage() {
        Object object = this.errorMessageView;
        if (object != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                object.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            object = this.player;
            if (object != null) {
                object.getPlayerError();
            }
            object = this.errorMessageView;
            int n3 = 8;
            object.setVisibility(n3);
        }
    }

    private void updateForCurrentTrackSelections(boolean bl2) {
        int n3;
        View view;
        ImmutableList immutableList;
        boolean bl3;
        f f5 = this.player;
        boolean bl4 = false;
        if (f5 != null && (bl3 = f5.isCommandAvailable(30)) && !(bl3 = (immutableList = f5.getCurrentTracks().a).isEmpty())) {
            bl3 = true;
        } else {
            bl3 = false;
            immutableList = null;
        }
        int n4 = this.keepContentOnPlayerReset;
        if (n4 == 0 && (!bl3 || bl2)) {
            this.hideArtwork();
            this.closeShutter();
            this.hideAndClearImage();
        }
        if (!bl3) {
            return;
        }
        bl2 = this.hasSelectedVideoTrack();
        bl3 = this.hasSelectedImageTrack();
        if (!bl2 && !bl3) {
            this.closeShutter();
            this.hideAndClearImage();
        }
        if ((view = this.shutterView) != null && (n4 = view.getVisibility()) == (n3 = 4) && (n4 = (int)(this.isImageSet() ? 1 : 0)) != 0) {
            bl4 = true;
        }
        if (bl3 && !bl2 && bl4) {
            this.closeShutter();
            this.showImage();
        } else if (bl2 && !bl3 && bl4) {
            this.hideAndClearImage();
        }
        if (!bl2 && !bl3 && (bl2 = this.useArtwork())) {
            bl2 = this.setArtworkFromMediaMetadata(f5);
            if (bl2) {
                return;
            }
            Drawable drawable2 = this.defaultArtwork;
            bl2 = this.setDrawableArtwork(drawable2);
            if (bl2) {
                return;
            }
        }
        this.hideArtwork();
    }

    private void updateImageViewAspectRatio() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        if ((imageView = imageView.getDrawable()) == null) {
            return;
        }
        int n3 = imageView.getIntrinsicWidth();
        int n4 = imageView.getIntrinsicHeight();
        if (n3 > 0 && n4 > 0) {
            Object object;
            float f5 = n3;
            float f6 = n4;
            f5 /= f6;
            imageView = ImageView.ScaleType.FIT_XY;
            int n7 = this.imageDisplayMode;
            int n8 = 1;
            if (n7 == n8) {
                n4 = this.getWidth();
                f6 = n4;
                n3 = this.getHeight();
                f5 = n3;
                f5 = f6 / f5;
                imageView = ImageView.ScaleType.CENTER_CROP;
            }
            if ((n7 = (object = this.imageView).getVisibility()) == 0) {
                object = this.contentFrame;
                this.onContentAspectRatioChanged((AspectRatioFrameLayout)((Object)object), f5);
            }
            ImageView imageView2 = this.imageView;
            imageView2.setScaleType((ImageView.ScaleType)imageView);
        }
    }

    private boolean useArtwork() {
        int n3 = this.artworkDisplayMode;
        if (n3 != 0) {
            ct3.h(this.artworkView);
            return true;
        }
        return false;
    }

    private boolean useController() {
        boolean bl2 = this.useController;
        if (bl2) {
            ct3.h((Object)this.controller);
            return true;
        }
        return false;
    }

    public void dispatchDraw(Canvas object) {
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(object);
        int n3 = gz3.a;
        int n4 = 34;
        if (n3 == n4 && (object = this.surfaceSyncGroupV34) != null && (n4 = (int)(this.enableComposeSurfaceSyncWorkaround ? 1 : 0)) != 0 && (surfaceSyncGroup = object.a) != null) {
            ru2.a(surfaceSyncGroup);
            n4 = 0;
            surfaceSyncGroup = null;
            object.a = null;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        PlayerControlView playerControlView;
        boolean bl2;
        boolean bl3;
        int n3;
        f f5 = this.player;
        if (f5 != null && (n3 = (int)(f5.isCommandAvailable((int)((bl3 = 16 != 0) ? 1 : 0)) ? 1 : 0)) != 0 && (n3 = (int)((f5 = this.player).isPlayingAd() ? 1 : 0)) != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        n3 = keyEvent.getKeyCode();
        n3 = (int)(this.isDpadKey(n3) ? 1 : 0);
        bl3 = true;
        if (n3 != 0 && (bl2 = this.useController()) && !(bl2 = (playerControlView = this.controller).g())) {
            this.maybeShowController(bl3);
        } else {
            boolean bl4;
            bl2 = this.dispatchMediaKeyEvent(keyEvent);
            if (!bl2 && !(bl4 = super.dispatchKeyEvent(keyEvent))) {
                if (n3 != 0 && (bl4 = this.useController())) {
                    this.maybeShowController(bl3);
                }
                bl3 = false;
            } else {
                this.maybeShowController(bl3);
            }
        }
        return bl3;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        PlayerControlView playerControlView;
        boolean bl2;
        boolean bl3 = this.useController();
        if (bl3 && (bl2 = (playerControlView = this.controller).c(keyEvent))) {
            bl2 = true;
        } else {
            bl2 = false;
            keyEvent = null;
        }
        return bl2;
    }

    public List getAdOverlayInfos() {
        e4 e42;
        ArrayList<e4> arrayList = new ArrayList<e4>();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            e42 = new e4((View)frameLayout);
            arrayList.add(e42);
        }
        if ((frameLayout = this.controller) != null) {
            e42 = new e4((View)frameLayout);
            arrayList.add(e42);
        }
        return ImmutableList.copyOf(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.adOverlayFrameLayout;
        ct3.i(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.artworkDisplayMode;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public int getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public f getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        ct3.h((Object)this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        int n3 = this.artworkDisplayMode;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.f();
        }
    }

    public boolean isControllerFullyVisible() {
        boolean bl2;
        PlayerControlView playerControlView = this.controller;
        if (playerControlView != null && (bl2 = playerControlView.g())) {
            bl2 = true;
        } else {
            bl2 = false;
            playerControlView = null;
        }
        return bl2;
    }

    public void onContentAspectRatioChanged(AspectRatioFrameLayout aspectRatioFrameLayout, float f5) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f5);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        boolean bl2 = view instanceof GLSurfaceView;
        if (bl2) {
            view = (GLSurfaceView)view;
            view.onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        boolean bl2 = view instanceof GLSurfaceView;
        if (bl2) {
            view = (GLSurfaceView)view;
            view.onResume();
        }
    }

    public boolean onTrackballEvent(MotionEvent object) {
        boolean bl2 = this.useController();
        if (bl2 && (object = this.player) != null) {
            bl2 = true;
            this.maybeShowController(bl2);
            return bl2;
        }
        return false;
    }

    public boolean performClick() {
        this.toggleControllerVisibility();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int n3) {
        int n4;
        ImageView imageView;
        if (n3 != 0 && (imageView = this.artworkView) == null) {
            n4 = 0;
            imageView = null;
        } else {
            n4 = 1;
        }
        ct3.f(n4 != 0);
        n4 = this.artworkDisplayMode;
        if (n4 != n3) {
            this.artworkDisplayMode = n3;
            this.updateForCurrentTrackSelections(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout$a aspectRatioFrameLayout$a) {
        ct3.h((Object)this.contentFrame);
        this.contentFrame.setAspectRatioListener(aspectRatioFrameLayout$a);
    }

    public void setControllerAnimationEnabled(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setAnimationEnabled(bl2);
    }

    public void setControllerAutoShow(boolean bl2) {
        this.controllerAutoShow = bl2;
    }

    public void setControllerHideDuringAds(boolean bl2) {
        this.controllerHideDuringAds = bl2;
    }

    public void setControllerHideOnTouch(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controllerHideOnTouch = bl2;
        this.updateContentDescription();
    }

    public void setControllerOnFullScreenModeChangedListener(PlayerControlView$c playerControlView$c) {
        ct3.h((Object)this.controller);
        this.controller.setOnFullScreenModeChangedListener(playerControlView$c);
    }

    public void setControllerShowTimeoutMs(int n3) {
        PlayerControlView playerControlView = this.controller;
        ct3.h((Object)playerControlView);
        this.controllerShowTimeoutMs = n3;
        PlayerControlView playerControlView2 = this.controller;
        n3 = (int)(playerControlView2.g() ? 1 : 0);
        if (n3 != 0) {
            this.showController();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView$l playerControlView$l) {
        ct3.h((Object)this.controller);
        Object object = this.legacyControllerVisibilityListener;
        if (object == playerControlView$l) {
            return;
        }
        if (object != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.controller.d;
            copyOnWriteArrayList.remove(object);
        }
        this.legacyControllerVisibilityListener = playerControlView$l;
        if (playerControlView$l != null) {
            object = this.controller;
            object.getClass();
            object = ((PlayerControlView)((Object)object)).d;
            ((CopyOnWriteArrayList)object).add(playerControlView$l);
            playerControlView$l = null;
            this.setControllerVisibilityListener((PlayerView$b)null);
        }
    }

    public void setControllerVisibilityListener(PlayerView$b playerView$b) {
        if (playerView$b != null) {
            playerView$b = null;
            this.setControllerVisibilityListener((PlayerControlView$l)null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean bl2;
        TextView textView = this.errorMessageView;
        if (textView != null) {
            bl2 = true;
        } else {
            bl2 = false;
            textView = null;
        }
        ct3.f(bl2);
        this.customErrorMessage = charSequence;
        this.updateErrorMessage();
    }

    public void setDefaultArtwork(Drawable drawable2) {
        Drawable drawable3 = this.defaultArtwork;
        if (drawable3 != drawable2) {
            this.defaultArtwork = drawable2;
            drawable2 = null;
            this.updateForCurrentTrackSelections(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean bl2) {
        this.enableComposeSurfaceSyncWorkaround = bl2;
    }

    public void setErrorMessageProvider(bB0 bB02) {
        if (bB02 != null) {
            this.updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(long[] lArray, boolean[] blArray) {
        ct3.h((Object)this.controller);
        this.controller.setExtraAdGroupMarkers(lArray, blArray);
    }

    public void setFullscreenButtonClickListener(PlayerView$c object) {
        ct3.h((Object)this.controller);
        object = this.controller;
        PlayerView$a playerView$a = this.componentListener;
        ((PlayerControlView)((Object)object)).setOnFullScreenModeChangedListener(playerView$a);
    }

    public void setFullscreenButtonState(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.k(bl2);
    }

    public void setImageDisplayMode(int n3) {
        int n4;
        ImageView imageView = this.imageView;
        if (imageView != null) {
            n4 = 1;
        } else {
            n4 = 0;
            imageView = null;
        }
        ct3.f(n4 != 0);
        n4 = this.imageDisplayMode;
        if (n4 != n3) {
            this.imageDisplayMode = n3;
            this.updateImageViewAspectRatio();
        }
    }

    public void setKeepContentOnPlayerReset(boolean bl2) {
        boolean bl3 = this.keepContentOnPlayerReset;
        if (bl3 != bl2) {
            this.keepContentOnPlayerReset = bl2;
            bl2 = false;
            this.updateForCurrentTrackSelections(false);
        }
    }

    public void setPlayer(f f5) {
        boolean bl2;
        PlayerView$a playerView$a;
        boolean bl3;
        Object object = Looper.myLooper();
        Object object2 = Looper.getMainLooper();
        boolean bl4 = true;
        if (object == object2) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        ct3.f(bl3);
        if (f5 != null && (object = f5.getApplicationLooper()) != (object2 = Looper.getMainLooper())) {
            bl3 = false;
            object = null;
        } else {
            bl3 = true;
        }
        ct3.a(bl3);
        object = this.player;
        if (object == f5) {
            return;
        }
        int n3 = 27;
        if (object != null) {
            playerView$a = this.componentListener;
            object.removeListener(playerView$a);
            bl2 = object.isCommandAvailable(n3);
            if (bl2) {
                playerView$a = this.surfaceView;
                boolean bl5 = playerView$a instanceof TextureView;
                if (bl5) {
                    playerView$a = (TextureView)playerView$a;
                    object.clearVideoTextureView((TextureView)playerView$a);
                } else {
                    bl5 = playerView$a instanceof SurfaceView;
                    if (bl5) {
                        playerView$a = (SurfaceView)playerView$a;
                        object.clearVideoSurfaceView((SurfaceView)playerView$a);
                    }
                }
            }
            this.clearImageOutput((f)object);
        }
        if ((object = this.subtitleView) != null) {
            bl2 = false;
            playerView$a = null;
            ((SubtitleView)((Object)object)).setCues(null);
        }
        this.player = f5;
        bl3 = this.useController();
        if (bl3) {
            object = this.controller;
            ((PlayerControlView)((Object)object)).setPlayer(f5);
        }
        this.updateBuffering();
        this.updateErrorMessage();
        this.updateForCurrentTrackSelections(bl4);
        if (f5 != null) {
            bl3 = f5.isCommandAvailable(n3);
            if (bl3) {
                object = this.surfaceView;
                n3 = object instanceof TextureView;
                if (n3 != 0) {
                    object = (TextureView)object;
                    f5.setVideoTextureView((TextureView)object);
                } else {
                    n3 = object instanceof SurfaceView;
                    if (n3 != 0) {
                        object = (SurfaceView)object;
                        f5.setVideoSurfaceView((SurfaceView)object);
                    }
                }
                bl3 = f5.isCommandAvailable(30);
                if (!bl3 || (bl3 = ((bq3)(object = f5.getCurrentTracks())).c())) {
                    this.updateAspectRatio();
                }
            }
            if ((object = this.subtitleView) != null && (bl3 = f5.isCommandAvailable(28))) {
                object = this.subtitleView;
                object2 = f5.getCurrentCues().a;
                ((SubtitleView)((Object)object)).setCues((List)object2);
            }
            object = this.componentListener;
            f5.addListener((f$c)object);
            this.setImageOutput(f5);
            this.maybeShowController(false);
        } else {
            this.hideController();
        }
    }

    public void setRepeatToggleModes(int n3) {
        ct3.h((Object)this.controller);
        this.controller.setRepeatToggleModes(n3);
    }

    public void setResizeMode(int n3) {
        ct3.h((Object)this.contentFrame);
        this.contentFrame.setResizeMode(n3);
    }

    public void setShowBuffering(int n3) {
        int n4 = this.showBuffering;
        if (n4 != n3) {
            this.showBuffering = n3;
            this.updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowFastForwardButton(bl2);
    }

    public void setShowMultiWindowTimeBar(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowMultiWindowTimeBar(bl2);
    }

    public void setShowNextButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowNextButton(bl2);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowPlayButtonIfPlaybackIsSuppressed(bl2);
    }

    public void setShowPreviousButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowPreviousButton(bl2);
    }

    public void setShowRewindButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowRewindButton(bl2);
    }

    public void setShowShuffleButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowShuffleButton(bl2);
    }

    public void setShowSubtitleButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowSubtitleButton(bl2);
    }

    public void setShowVrButton(boolean bl2) {
        ct3.h((Object)this.controller);
        this.controller.setShowVrButton(bl2);
    }

    public void setShutterBackgroundColor(int n3) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(n3);
        }
    }

    public void setUseArtwork(boolean bl2) {
        this.setArtworkDisplayMode((int)((bl2 ^= true) ? 1 : 0));
    }

    public void setUseController(boolean bl2) {
        f f5;
        boolean bl3;
        PlayerControlView playerControlView;
        boolean bl4 = true;
        if (bl2 && (playerControlView = this.controller) == null) {
            bl3 = false;
            playerControlView = null;
        } else {
            bl3 = true;
        }
        ct3.f(bl3);
        if (!bl2 && !(bl3 = this.hasOnClickListeners())) {
            bl4 = false;
            f5 = null;
        }
        this.setClickable(bl4);
        bl4 = this.useController;
        if (bl4 == bl2) {
            return;
        }
        this.useController = bl2;
        bl2 = this.useController();
        if (bl2) {
            PlayerControlView playerControlView2 = this.controller;
            f5 = this.player;
            playerControlView2.setPlayer(f5);
        } else {
            PlayerControlView playerControlView3 = this.controller;
            if (playerControlView3 != null) {
                playerControlView3.f();
                playerControlView3 = this.controller;
                bl4 = false;
                f5 = null;
                playerControlView3.setPlayer(null);
            }
        }
        this.updateContentDescription();
    }

    public void setVisibility(int n3) {
        super.setVisibility(n3);
        View view = this.surfaceView;
        boolean bl2 = view instanceof SurfaceView;
        if (bl2) {
            view.setVisibility(n3);
        }
    }

    public void showController() {
        boolean bl2 = this.shouldShowControllerIndefinitely();
        this.showController(bl2);
    }
}

