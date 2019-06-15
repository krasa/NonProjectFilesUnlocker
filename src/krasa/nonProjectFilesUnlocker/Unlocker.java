
package krasa.nonProjectFilesUnlocker;

import org.jetbrains.annotations.NotNull;

import com.intellij.openapi.fileEditor.impl.NonProjectFileWritingAccessExtension;
import com.intellij.openapi.vfs.VirtualFile;

public class Unlocker implements NonProjectFileWritingAccessExtension {
	public Unlocker() {
	}

	public boolean isWritable(@NotNull VirtualFile file) {
		return true;
	}
}
