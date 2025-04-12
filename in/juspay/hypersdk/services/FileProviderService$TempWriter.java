/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package in.juspay.hypersdk.services;

import android.content.Context;
import in.juspay.hypersdk.services.FileProviderService;
import in.juspay.hypersdk.services.FileProviderService$1;
import in.juspay.hypersdk.services.FileProviderService$Mode;
import java.io.File;
import java.io.FileNotFoundException;

public final class FileProviderService$TempWriter {
    private final File tempDir;
    final /* synthetic */ FileProviderService this$0;

    public FileProviderService$TempWriter(FileProviderService object, String string2, FileProviderService$Mode object2) {
        this.this$0 = object;
        int[] nArray = FileProviderService$1.$SwitchMap$in$juspay$hypersdk$services$FileProviderService$Mode;
        int n3 = ((Enum)object2).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                object = null;
            } else {
                n3 = (int)(((File)(object = FileProviderService.access$000((FileProviderService)object).openInCache(string2))).exists() ? 1 : 0);
                if (n3 == 0) {
                    string2 = Ft2.a(string2, " does not exist in cache!");
                    object = new FileNotFoundException(string2);
                    throw object;
                }
            }
        } else {
            long l2 = System.currentTimeMillis();
            String string3 = "temp-";
            super(string3);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("-");
            ((StringBuilder)object2).append(l2);
            string2 = ((StringBuilder)object2).toString();
            object = FileProviderService.access$000((FileProviderService)object).openInCache(string2);
            ((File)object).mkdir();
        }
        this.tempDir = object;
    }

    public String getDirName() {
        return this.tempDir.getName();
    }

    public String[] list() {
        return FileProviderService.access$300(this.tempDir);
    }

    public boolean moveToMain(String object, String string2) {
        Object object2 = this.tempDir;
        File file = new File((File)object2, (String)(object = FileProviderService.access$400(this.this$0.appendSdkNameAndVersion((String)object))));
        boolean bl2 = file.exists();
        if (bl2) {
            object2 = this.this$0;
            Context context = FileProviderService.access$100((FileProviderService)object2).getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("/");
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object = FileProviderService.access$500((FileProviderService)object2, context, (String)object);
            return file.renameTo((File)object);
        }
        return false;
    }

    public boolean write(String object, byte[] byArray) {
        object = this.this$0.appendSdkNameAndVersion((String)object);
        File file = this.tempDir;
        File file2 = new File(file, (String)object);
        object = this.this$0;
        file = FileProviderService.access$100((FileProviderService)object).getContext();
        return FileProviderService.access$200((FileProviderService)object, (Context)file, file2, byArray, false);
    }
}

