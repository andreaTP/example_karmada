package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"association","dependentOverrides","placement","propagateDeps","resourceSelectors","schedulerName"})
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
public class PropagationPolicySpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("association")
    private Boolean association;

    public Boolean getAssociation() {
        return association;
    }

    public void setAssociation(Boolean association) {
        this.association = association;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dependentOverrides")
    private java.util.List<String> dependentOverrides;

    public java.util.List<String> getDependentOverrides() {
        return dependentOverrides;
    }

    public void setDependentOverrides(java.util.List<String> dependentOverrides) {
        this.dependentOverrides = dependentOverrides;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("placement")
    private PlacementSpec placement;

    public PlacementSpec getPlacement() {
        return placement;
    }

    public void setPlacement(PlacementSpec placement) {
        this.placement = placement;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("propagateDeps")
    private Boolean propagateDeps;

    public Boolean getPropagateDeps() {
        return propagateDeps;
    }

    public void setPropagateDeps(Boolean propagateDeps) {
        this.propagateDeps = propagateDeps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectors")
    @javax.validation.constraints.NotNull()
    private java.util.List<ResourceSelectorsSpec> resourceSelectors;

    public java.util.List<ResourceSelectorsSpec> getResourceSelectors() {
        return resourceSelectors;
    }

    public void setResourceSelectors(java.util.List<ResourceSelectorsSpec> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schedulerName")
    private String schedulerName;

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }
}
