//package com.example.finalprojekt.ui;
//
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.button.ButtonVariant;
//import com.vaadin.flow.component.dialog.Dialog;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.component.orderedlayout.FlexComponent;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.router.Route;
//
//@Route("dialog-basic")
//public class AddCarDialog extends Div {
//
//    public AddCarDialog() {
//        Dialog dialog = new Dialog();
//
//        dialog.setHeaderTitle("New employee");
//
//        VerticalLayout dialogLayout = createDialogLayout();
//        dialog.add(dialogLayout);
//
//        Button saveButton = createSaveButton(dialog);
//        Button cancelButton = new Button("Cancel", e -> dialog.close());
//        dialog.getFooter().add(cancelButton);
//        dialog.getFooter().add(saveButton);
//
//        Button button = new Button("Show dialog", e -> dialog.open());
//
//        add(dialog, button);
//
//        dialog.open();
//
//        // Center the button within the example
//        getStyle().set("position", "fixed").set("top", "0").set("right", "0")
//                .set("bottom", "0").set("left", "0").set("display", "flex")
//                .set("align-items", "center").set("justify-content", "center");
//    }
//
//    private static VerticalLayout createDialogLayout() {
//
//        TextField firstNameField = new TextField("First name");
//        TextField lastNameField = new TextField("Last name");
//
//        VerticalLayout dialogLayout = new VerticalLayout(firstNameField,
//                lastNameField);
//        dialogLayout.setPadding(false);
//        dialogLayout.setSpacing(false);
//        dialogLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
//        dialogLayout.getStyle().set("width", "18rem").set("max-width", "100%");
//
//        return dialogLayout;
//    }
//
//    private static Button createSaveButton(Dialog dialog) {
//        Button saveButton = new Button("Add", e -> dialog.close());
//        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
//
//
//        return saveButton;
//    }
//}
