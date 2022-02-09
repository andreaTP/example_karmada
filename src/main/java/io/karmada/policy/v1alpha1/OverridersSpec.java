package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"argsOverrider","commandOverrider","imageOverrider","plaintext"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@lombok.Setter()
@lombok.experimental.Accessors(prefix = {
    "_",
    ""
})
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class OverridersSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("argsOverrider")
    private java.util.List<ArgsOverriderSpec> argsOverrider;

    public java.util.List<ArgsOverriderSpec> getArgsOverrider() {
        return argsOverrider;
    }

    public void setArgsOverrider(java.util.List<ArgsOverriderSpec> argsOverrider) {
        this.argsOverrider = argsOverrider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("commandOverrider")
    private java.util.List<CommandOverriderSpec> commandOverrider;

    public java.util.List<CommandOverriderSpec> getCommandOverrider() {
        return commandOverrider;
    }

    public void setCommandOverrider(java.util.List<CommandOverriderSpec> commandOverrider) {
        this.commandOverrider = commandOverrider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imageOverrider")
    private java.util.List<ImageOverriderSpec> imageOverrider;

    public java.util.List<ImageOverriderSpec> getImageOverrider() {
        return imageOverrider;
    }

    public void setImageOverrider(java.util.List<ImageOverriderSpec> imageOverrider) {
        this.imageOverrider = imageOverrider;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    private java.util.List<PlaintextSpec> plaintext;

    public java.util.List<PlaintextSpec> getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(java.util.List<PlaintextSpec> plaintext) {
        this.plaintext = plaintext;
    }
}
