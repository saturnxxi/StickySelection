package com.mnw.stickyhighlight.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Editor;
import com.mnw.stickyhighlight.StickyHighlightAppComponent;

/**
 * TODO description of this class is missing
 */
public class PaintSelectionTo0Action extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent actionEvent) {
        Editor editor = actionEvent.getData(PlatformDataKeys.EDITOR);
        Application application = ApplicationManager.getApplication();
        StickyHighlightAppComponent identHighlightComp = application.getComponent(StickyHighlightAppComponent.class);
        identHighlightComp.paintSelection(editor, 0);
    }
}