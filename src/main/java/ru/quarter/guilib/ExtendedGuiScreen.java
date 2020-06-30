package ru.quarter.guilib;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import ru.quarter.guilib.components.container.BasicComponentContainer;

import java.io.IOException;

public class ExtendedGuiScreen extends GuiScreen {

    private final BasicComponentContainer container = new BasicComponentContainer();

    public ExtendedGuiScreen() {}

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        container.onHover(mouseX, mouseY);
        container.draw();
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        super.keyTyped(typedChar, keyCode);
        container.keyPressed(typedChar, keyCode);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        container.mousePressed(mouseX, mouseY, mouseButton);
    }

    @Override
    public void onResize(Minecraft mc, int w, int h) {
        super.onResize(mc, w, h);
        container.onResize(mc, w, h);
    }
}
