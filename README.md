# Oscilirector--ShapeShifter-
JavaFX ShapeShifter Node
  
  
  Oscillirector is a cheap shapeshifter node class that changes its shape when hovered and when not hovered. Any shape that extends the shape class can be shaped with the Oscillirector, it is pretty basic created in 5 minutes. 
  The default hovered shape is a Round circle or Cirlce and the non-hovered shape is a Rectangle, but any shape can be specified for it.
  
 In ACTION
  
  <a href='http://postimg.org/image/sxr01ev6l/' target='_blank'><img src='http://s22.postimg.org/sxr01ev6l/oscillirector.jpg' border='0' alt="oscillirector" /></a>


# HOW IT WORKS

This simple node uses events from the mouse tracker to change shapes of the Node, it is precisely accurate to use onMouseEntered and onMouseExited to trigger events but rather it uses the onHoverProperty() to enable implementors to trigger their code prior to the changing of the shape.. Whenever new children are added the Node infront of the other children is relocated, initially Oscilirector was suppose to host only one child node and the innter child node will host other children but preference is upon you, but it best fits the UI beauty when it consist of only one child 
goTo codes [oscil](https://github.com/Elltz/Oscilirector--ShapeShifter-/blob/master/Oscilirector)
