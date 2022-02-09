package io.karmada.work.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"hardNodeAffinity","nodeSelector","tolerations"})
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
public class NodeClaimSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("hardNodeAffinity")
    private HardNodeAffinitySpec hardNodeAffinity;

    public HardNodeAffinitySpec getHardNodeAffinity() {
        return hardNodeAffinity;
    }

    public void setHardNodeAffinity(HardNodeAffinitySpec hardNodeAffinity) {
        this.hardNodeAffinity = hardNodeAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    private java.util.Map<java.lang.String, String> nodeSelector;

    public java.util.Map<java.lang.String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(java.util.Map<java.lang.String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tolerations")
    private java.util.List<TolerationsSpec> tolerations;

    public java.util.List<TolerationsSpec> getTolerations() {
        return tolerations;
    }

    public void setTolerations(java.util.List<TolerationsSpec> tolerations) {
        this.tolerations = tolerations;
    }
}
