package io.karmada.work.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"aggregatedStatus","conditions"})
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
public class ResourceBindingStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedStatus")
    private java.util.List<ResourceBindingAggregatedStatus> aggregatedStatus;

    public java.util.List<ResourceBindingAggregatedStatus> getAggregatedStatus() {
        return aggregatedStatus;
    }

    public void setAggregatedStatus(java.util.List<ResourceBindingAggregatedStatus> aggregatedStatus) {
        this.aggregatedStatus = aggregatedStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private java.util.List<ResourceBindingConditions> conditions;

    public java.util.List<ResourceBindingConditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<ResourceBindingConditions> conditions) {
        this.conditions = conditions;
    }
}
