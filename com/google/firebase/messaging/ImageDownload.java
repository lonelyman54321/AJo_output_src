/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ByteStreams;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ImageDownload
implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 0x100000;
    private volatile Future future;
    private Task task;
    private final URL url;

    private ImageDownload(URL uRL) {
        this.url = uRL;
    }

    public static /* synthetic */ void a(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        imageDownload.lambda$start$0(taskCompletionSource);
    }

    private byte[] blockingDownloadBytes() {
        int n3;
        Object object = this.url.openConnection();
        int n4 = ((URLConnection)object).getContentLength();
        if (n4 <= (n3 = 0x100000)) {
            object = ((URLConnection)object).getInputStream();
            long l2 = 0x100001L;
            Object object2 = ByteStreams.limit((InputStream)object, l2);
            object2 = ByteStreams.toByteArray((InputStream)object2);
            object = "FirebaseMessaging";
            int n7 = 2;
            int n8 = Log.isLoggable((String)object, (int)n7);
            if (n8 != 0) {
                n8 = ((Object)object2).length;
                object = this.url;
                Objects.toString(object);
            }
            if ((n8 = ((Object)object2).length) <= n3) {
                return object2;
            }
            object = new IOException("Image exceeds max size of 1048576");
            throw object;
            finally {
                if (object != null) {
                    try {
                        ((InputStream)object).close();
                    }
                    catch (Throwable throwable) {
                        Throwable throwable2;
                        throwable2.addSuppressed(throwable);
                    }
                }
            }
        }
        object = new IOException("Content-Length exceeds max size of 1048576");
        throw object;
    }

    public static ImageDownload create(String string2) {
        URL uRL;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            return null;
        }
        try {
            uRL = new URL(string2);
        }
        catch (MalformedURLException malformedURLException) {
            return null;
        }
        ImageDownload imageDownload = new ImageDownload(uRL);
        return imageDownload;
    }

    private /* synthetic */ void lambda$start$0(TaskCompletionSource taskCompletionSource) {
        Bitmap bitmap = this.blockingDownload();
        try {
            taskCompletionSource.setResult(bitmap);
        }
        catch (Exception exception) {
            taskCompletionSource.setException(exception);
        }
    }

    public Bitmap blockingDownload() {
        Object object;
        Object object2 = "FirebaseMessaging";
        boolean bl2 = Log.isLoggable((String)object2, (int)4);
        if (bl2) {
            object = this.url;
            Objects.toString(object);
        }
        object = this.blockingDownloadBytes();
        int n3 = ((Object)object).length;
        if ((object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3)) != null) {
            n3 = 3;
            boolean bl3 = Log.isLoggable((String)object2, (int)n3);
            if (bl3) {
                object2 = this.url;
                Objects.toString(object2);
            }
            return object;
        }
        object2 = new StringBuilder("Failed to decode image: ");
        URL uRL = this.url;
        ((StringBuilder)object2).append(uRL);
        object2 = ((StringBuilder)object2).toString();
        object = new IOException((String)object2);
        throw object;
    }

    public void close() {
        this.future.cancel(true);
    }

    public Task getTask() {
        return (Task)Preconditions.checkNotNull(this.task);
    }

    public void start(ExecutorService object) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Ld1 ld1 = new Ld1(this, taskCompletionSource);
        this.future = object = object.submit(ld1);
        this.task = object = taskCompletionSource.getTask();
    }
}

