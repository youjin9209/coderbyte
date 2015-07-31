def ABCheck(arg_11)
  
 arg_11= arg_11.match(/(a.{3}b)|(b.{3}a)/) ? true : false

  return arg_11 
         
end
   
# keep this function call here 
# to see how to enter arguments in Ruby scroll down   
ABCheck(STDIN.gets)  

