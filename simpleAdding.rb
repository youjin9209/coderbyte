def SimpleAdding(num)

  # code goes here
  sum =0
  (num+1).times do |x|
    sum = sum+x
  end
  return sum 
         
end
   
# keep this function call here 
# to see how to enter arguments in Ruby scroll down   
SimpleAdding(STDIN.gets)  
